public class Conta {

    private String nomeTitular;
    private double saldo;

    public Conta(String nomeTitular, double saldo) {
       setNomeTitular(nomeTitular);
       setSaldo(saldo);
    }

    public String getNomeTitular() {

        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular == null || nomeTitular.isBlank()){
            throw new IllegalArgumentException("Nome Informado é Inválido!");
        }
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {

        return saldo;
    }

    //setSaldo, nao tem necessidade de existir, pelo simples fato de
    //o saldo somente mudar o valor mediante ao deposito ou saque
    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }


    // sacar

    public void valorASacar (double valorSaque){
        if (valorSaque <= 0 || valorSaque > saldo)
        {
            throw new IllegalArgumentException("Valor Informado é Inválido!");
        }
        saldo -= valorSaque;
    }

    // depositar

    public void valorDepositar (double valorDeposito){
        if (valorDeposito <= 0){
            throw new IllegalArgumentException("Valor Informado é Inválido!");
        }
        saldo += valorDeposito;
    }

    // transferir

    public void valorTransferir (Conta destino, double valorTransferencia){
        if (valorTransferencia <= 0 || destino == null || valorTransferencia > saldo){
            throw new IllegalArgumentException("Transferencia Inválida");
        }
        saldo -= valorTransferencia;
        //destino.valorDepositar(valorTransferencia);
        destino.saldo += valorTransferencia;
    }

    //investimento

    public double investimento (double valor, int tempo){
        if(tempo <= 0 || valor <=0){
            throw new IllegalArgumentException("Tempo ou Valor informado esta Inválido!");
        }
        double resultado =valor*Math.pow(1.01, tempo);
        return resultado;


    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

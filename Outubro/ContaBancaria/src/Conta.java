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

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

public class Ex08 {
    public static void main(String[] args) {

        ImpostoRenda Joao = new ImpostoRenda("João Antonio dos Santos","12345678900","RS",2800);
        ImpostoRenda Maria = new ImpostoRenda("Maria Regina","45788897514","SC", 10000);
        ImpostoRenda Zezinho = new ImpostoRenda("Zezinho da Silva","11111111111","PR", 5000);
        ImpostoRenda Marques = new ImpostoRenda("Leandro Marques","22211133389","RS", 27000);
        ImpostoRenda Lian = new ImpostoRenda("Lian Carlos de Almeida", "98766681900","SC", 36000);

        ImpostoRenda[] clientes = {Joao,Maria,Zezinho,Marques,Lian};

        // a) Quem mais paga imposto.

        double maiorImposto=0;
        ImpostoRenda contribuinteMaiorImposto = null;

        for (int i =0; i < clientes.length; i++){
            if(clientes[i].calcularImposto() > maiorImposto){
                maiorImposto = clientes[i].calcularImposto();
                contribuinteMaiorImposto = clientes[i];
            }
        }
        System.out.println(contribuinteMaiorImposto);

        // b) Qual o total de imposto pago entre os 5 contribuintes?

        double totalImposto = 0;
        for (int i = 0; i < clientes.length; i++){
            totalImposto += clientes[i].calcularImposto();
        }

        System.out.println("O total do Imposto de Renda Pago : " +totalImposto);

    }
}

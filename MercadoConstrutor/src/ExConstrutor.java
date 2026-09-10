public class ExConstrutor {
    public static void main(String[] args) {

        Mercado unidadeDeBlumenau = new Mercado("Mercado Blumenau", 5000, 1.20, 200, 1.20);

        Mercado unidadeDeJoinville = new Mercado("SuperJOinville", 1000, 1.30, 100, 1.30);

       Mercado unidadeDeFlorianopolis = new Mercado("Ilha Bela", 500, 1.50, 2000, 3.00);

        Mercado mercados[] = {unidadeDeBlumenau, unidadeDeFlorianopolis, unidadeDeJoinville};
        //comporta o "objeto inteiro"

        // quem teve a maior receita vendendo maças?

        double maiorReceitaMacas = 0;
        Mercado mercadoMaiorReceitaMacas = null;

        for (int i = 0; i < mercados.length; i++){
            if (mercados[i].calcularReceitaMaca() > maiorReceitaMacas){
                maiorReceitaMacas = mercados[i].calcularReceitaMaca();
                mercadoMaiorReceitaMacas = mercados[i];
            }
        }
        System.out.println("\n"+ mercadoMaiorReceitaMacas);
        System.out.println("\n"+ maiorReceitaMacas);



        // Quem teve a menor receita vendendo laranjas?

        double menorReceitaLaranja = Double.MAX_VALUE;
        Mercado mercadoMenorReceitaLaranjas = null;

        for (int i =0 ; i < mercados.length; i++){
            if (mercados[i].calcularReceitaLaranjas() < menorReceitaLaranja){
                menorReceitaLaranja = mercados[i].calcularReceitaLaranjas();
                mercadoMenorReceitaLaranjas = mercados[i];
            }
        }
        System.out.println("\n"+ mercadoMenorReceitaLaranjas);
        System.out.println(menorReceitaLaranja);

        // qual das lojas teve a segunda maior receita total?

        double segundaMaiorReceitaTotal = 0;
        Mercado mercadoSegundaMaiorReceitaTotal = null;

        double maiorReceitaTotal = 0;

        for (int i = 0; i < mercados.length; i ++){
            if (mercados[i].calcularReceitaTotal() > maiorReceitaTotal){
                maiorReceitaTotal = mercados[i].calcularReceitaTotal();

            }
        }
        for (int i = 0; i < mercados.length; i ++) {
            if (mercados[i].calcularReceitaTotal() > segundaMaiorReceitaTotal
                    && mercados[i].calcularReceitaTotal() != maiorReceitaTotal) {

                segundaMaiorReceitaTotal = mercados[i].calcularReceitaTotal();
                mercadoSegundaMaiorReceitaTotal = mercados[i];
            }
        }
        System.out.println("\nMercado que teve a segunda maior receita total : " + mercadoSegundaMaiorReceitaTotal+"\n");

        // Juntando as 3 lojas, a franquia teve uma receita maior vendendo maças ou laranjas

        double receitaGeralMaca = 0;
        double receitaGeralLaranjas = 0;

        for (int i = 0; i < mercados.length; i++){
            receitaGeralLaranjas += mercados[i].calcularReceitaLaranjas();
            receitaGeralMaca = mercados[i].calcularReceitaMaca();
        }
        if (receitaGeralMaca > receitaGeralLaranjas){
            System.out.println("A franquia que teve a maior receita com Maças:  " + receitaGeralMaca);

        } else if (receitaGeralLaranjas > receitaGeralMaca) {
            System.out.println("A franquia que teve a menor receita com Laranjas : " + receitaGeralLaranjas);

        }else {
            System.out.println("As receitas foram iguais.");
        }

    }
}

public class Ex06 {
    public static void main(String[] args) {

        Mercado unidadeDeBlumenau = new Mercado();

        unidadeDeBlumenau.nomeMercado = "Mercado Blumenau";
        unidadeDeBlumenau.macasVendidasAno = 5000;
        unidadeDeBlumenau.precoMaca = 1.20;
        unidadeDeBlumenau.laranjaVendidasAno= 4200;
        unidadeDeBlumenau.precoLaranja = 0.90;



        Mercado unidadeDeJoinville = new Mercado();

        unidadeDeJoinville.nomeMercado = "SuperMercado Joinville";
        unidadeDeJoinville.macasVendidasAno = 1000;
        unidadeDeJoinville.precoMaca = 1.30;
        unidadeDeJoinville.laranjaVendidasAno = 100;
        unidadeDeJoinville.precoLaranja = 0.80;



        Mercado unidadeDeFlorianopolis = new Mercado();

        unidadeDeFlorianopolis.nomeMercado = "Ilha Bela";
        unidadeDeFlorianopolis.macasVendidasAno = 500;
        unidadeDeFlorianopolis.precoMaca = 1.50;
        unidadeDeFlorianopolis.laranjaVendidasAno = 2000;
        unidadeDeFlorianopolis.precoLaranja = 3.00;


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
        System.out.println(mercadoMaiorReceitaMacas.nomeMercado);
        System.out.println(maiorReceitaMacas);



        // Quem teve a menor receita vendendo laranjas?

        double menorReceitaLaranja = Double.MAX_VALUE;
        Mercado mercadoMenorReceitaLaranjas = null;

        for (int i =0 ; i < mercados.length; i++){
            if (mercados[i].calcularReceitaLaranjas() < menorReceitaLaranja){
                menorReceitaLaranja = mercados[i].calcularReceitaLaranjas();
                mercadoMenorReceitaLaranjas = mercados[i];
            }
        }
        System.out.println(mercadoMenorReceitaLaranjas.nomeMercado);
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
        System.out.println("Mercado que teve a segunda maior receita total : " + mercadoSegundaMaiorReceitaTotal.nomeMercado);

        // Juntando as 3 lojas, a franquia teve uma receita maior vendendo maças ou laranjas

        double receitaGeralMaca = 0;
        double receitaGeralLaranjas = 0;

        for (int i = 0; i < mercados.length; i++){
            receitaGeralLaranjas += mercados[i].calcularReceitaLaranjas();
            receitaGeralMaca = mercados[i].calcularReceitaMaca();
        }
        if (receitaGeralMaca > receitaGeralLaranjas){
            System.out.println("A franquia que teve a maior receita com Maças:  " + mercadoMaiorReceitaMacas.nomeMercado);

        } else if (receitaGeralLaranjas > receitaGeralMaca) {
            System.out.println("A franquia que teve a menor receita com Laranjas : " + mercadoMenorReceitaLaranjas.nomeMercado);

        }else {
            System.out.println("As receitas foram iguais.");
        }


    }
}

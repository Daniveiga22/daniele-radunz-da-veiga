import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        // Exercício 04
        // Escreva um algoritmo que leia o número de inscrição e
        // a altura de um atleta e informe:
        //• O número de inscrição e a altura do atleta mais alto
        //• O número de inscrição e a altura do atleta mais baixo
        //• A altura média do grupo de atletas
        //• A quantidade de atletas cadastrados
        //A leitura deve ser finalizada ao digitar 0 para o número de inscrição.

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número de inscrição : ");
        String numInscricao = input.next();

        System.out.println("Informe a altura : ");
        double altura = input.nextDouble();

        double alturaMaisBaixa = Double.MAX_VALUE; // Inicia-se com o valor mais alto que existe, nesse caso usa-se essa expressao
        double alturaMaisAlto = Double.MIN_VALUE; // Incia-se com o valor mais baixo existente
        String inscricaoMaisBaixo = "";
        String inscricaoMaisAlto = "";
        double somaAltura =0;
        int qtdAtletas = 0;


        while(!numInscricao.equals("0"))
        //"enquanto" numIncricao !(for diferente) de 0.
        // .equals é usado para tipo "String"
        {
            somaAltura += altura; // soma a altura anterior com a informada
            qtdAtletas++; //soma a quantidade de atletas informados
           if (altura > alturaMaisAlto)
           {
               alturaMaisAlto = altura;
               inscricaoMaisAlto = numInscricao;
           }
           if (altura < alturaMaisBaixa)
           {
               alturaMaisBaixa = altura;
               inscricaoMaisBaixo = numInscricao;
           }
            System.out.println("Informe o número de inscrição : ");
             numInscricao = input.next();

            System.out.println("Informe a altura : ");
             altura = input.nextDouble();
        }

        double media = somaAltura / qtdAtletas;

        System.out.println("Média de Alturas : "+media+ " metros.");
        System.out.println("Foram informados : " +qtdAtletas);

        System.out.println("Atleta mais alto : "+alturaMaisAlto+ " metros, com inscrição : "+inscricaoMaisAlto+".");
        System.out.println("Atleta mais baixo : "+alturaMaisBaixa+ " metros, com inscrição : "+inscricaoMaisBaixo+".");

        input.close();



    }
}

import java.util.Scanner;

public class metodos01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //exercícios 01
        // Faça um programa em que o usuário entre com um número de 1 a 4
        //Com o número 1 sendo verão, 2 sendo outono...
        //Dependendo de o que o usuário informa, imprima:
        //É verão
        //E o tempo está quente
        //Ou
        //É inverno
        //E está frio
        //Faça um metodo para cada estação do ano



        System.out.println("Estações do Ano : ");
        System.out.println(" 1 - Verão");
        System.out.println(" 2 - Outono");
        System.out.println(" 3 - Inverno");
        System.out.println(" 4 - Primavera");
        System.out.println("Informe uma das opções acima : ");
        int opcao = input.nextInt();



            switch (opcao) {

                case 1:
                    verao();
                    break;

                case 2:
                    outono();
                    break;

                case 3:
                    inverno();
                    break;

                case 4:
                    primavera();
                    break;

                default:
                    System.out.println("Valor informado é inválido!");
                    break;

            }





        input.close();


    }
    public static void verao () {
        System.out.println("É Verão!");
        System.out.println("O tempo esta quente!");
        System.out.println("É tempo de areia e mar!");
    }

    public static void outono () {
        System.out.println("É Outono!");
        System.out.println("O tempo esta esfriando!");
        System.out.println("É tempo de ver as folhas cairem");
    }

    public static void inverno () {
        System.out.println("É Inverno!");
        System.out.println("O tempo esta frio e chuvoso!");
        System.out.println("É tempo de sopa, coberto e filme!");
    }

    public static void primavera () {
        System.out.println("É Primavera!");
        System.out.println("O tempo esta esquentando novamente!");
        System.out.println("É tempo de ver os campos florirem!");
    }
}

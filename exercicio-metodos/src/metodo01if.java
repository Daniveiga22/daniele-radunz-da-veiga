import java.util.Scanner;

public class metodo01if {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Exercício 01 - Usando a função If

        System.out.println("Estações do Ano : ");
        System.out.println(" 1 - Verão");
        System.out.println(" 2 - Outono");
        System.out.println(" 3 - Inverno");
        System.out.println(" 4 - Primavera");
        System.out.println("Informe uma das opções acima : ");


        int opcao = input.nextInt();

        if (opcao == 1 )
        {
            verao();
        } else if (opcao == 2)
        {
            outono();
        } else if (opcao == 3)
        {
            inverno();
        } else if (opcao == 4)
        {
         primavera();
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
        System.out.println("É tempo de ver as folhas cairem.");
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

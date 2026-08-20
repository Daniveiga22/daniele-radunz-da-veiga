import java.util.Scanner;

public class exercicio7 {

    //Exercicio 07
    //Faça um programa em que o usuário entre com um número de 1 a 4
    //com o número 1 sendo verao, 2 sendo outono...
    //Depedendo de o que o usuário informa, retorne:
    //é verao
    //E o tempo esta quente
    //ou
    //É inverno
    //E esta frio


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Estações do ano");
        System.out.println("1 - Verão");
        System.out.println("2 - Outono");
        System.out.println("3 - Inverno");
        System.out.println("4 - Primavera");
        System.out.println("Informe uma das opções : ");
        int estacao = input.nextInt();



        if (estacao == 1) {


            System.out.println(imprimirVerao());

        } else if (estacao == 2) {


            System.out.println(imprimirOutono());

        } else if (estacao == 3) {


            System.out.println(imprimirInverno());

        } else if (estacao == 4) {


            System.out.println(imprimirPrimavera());
        }

    }


    public static String imprimirVerao() {
        return "É Verão!\nÉ tempo de praia!!";

    }


    public static String imprimirOutono() {
        return "É Outono!\nA estação das folhas!";
    }

    public static String imprimirInverno() {
        return "É Inverno!\nO frio chegou!";
    }

    public static String imprimirPrimavera() {
        return "É Primavera!\nEstação das Flores";
    }
}




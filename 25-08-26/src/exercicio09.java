import java.util.Scanner;

public class exercicio09 {

    public static boolean informarPar(int valor)
    {
        if(valor % 2 ==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        //Exercício 09
        //Faça um metdo booleano que retorne true se o
        //número passado como parametro seja par.
        //Retorne false caso seja impar.

        System.out.println("Informe um valor : ");
        int valor = input.nextInt();

        System.out.println("Valor informado é par ? " + informarPar(valor));

        input.close();

    }

}

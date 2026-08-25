import java.util.Scanner;

public class exercicio08 {

        //Exercício 08
        // Faça um programa que receba 3 notas do usuário e informe
        //a média aritmética dessas notas.
        //Retorne a média

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a primeira nota : ");
        double nota1 = input.nextDouble();
        System.out.println("Informe a segunda nota : ");
        double nota2 = input.nextDouble();
        System.out.println("Informe a terceira nota : ");
        double nota3 = input.nextDouble();

        System.out.println("A média das notas informadas é " +calcularMedia(nota1, nota2, nota3));

        input.close();

    }

    public static double calcularMedia(double nota1, double nota2, double nota3){
        //usar o nome da variavel sempre no infinitivo "calcular", "obter", "somar"
        return (nota1 + nota2 +nota3) / 3;

    }


}

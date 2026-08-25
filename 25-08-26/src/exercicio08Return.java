import java.util.Scanner;

public class exercicio08Return {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a primeira nota : ");
        double nota1 = input.nextDouble();
        System.out.println("Informe a segunda nota : ");
        double nota2 = input.nextDouble();
        System.out.println("Informe a terceira nota : ");
        double nota3 = input.nextDouble();

        System.out.println("A média das notas informadas é " + calcularMedia(nota1, nota2, nota3));

        input.close();

    }
    public static double calcularMedia(double nota1, double nota2, double nota3){
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10){
            return 0;
        }

        return (nota1 + nota2 + nota3)/3;
    }
}

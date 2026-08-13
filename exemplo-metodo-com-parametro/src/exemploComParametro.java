import java.util.Scanner;

public class exemploComParametro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        desempenharCalculo(5, 4, 2);

        input.close();

    }
    public static void desempenharCalculo(double num1, double num2, double num3) {
        double resultado = (num1 + num2) * num3;
        System.out.println(resultado);
    }
}

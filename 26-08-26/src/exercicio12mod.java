import java.util.Scanner;

public class exercicio12mod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira a palavra ");
        String palavra = input.next();
    }
    public static char obterCaracter(String palavra) {

        return palavra.length() % 2 == 0 ? palavra.charAt(0) : palavra.charAt(1)
    }
}
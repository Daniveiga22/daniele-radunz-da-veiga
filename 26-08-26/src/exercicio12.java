import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira a palavra ");
        String palavra = input.next();
    }
    public static char obterCaracter(String palavra)
    {
        if(palavra.length()% 2 == 0){
            return palavra.charAt(0);
        }
        return palavra.charAt(1);
    }
}

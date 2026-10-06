import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        List<Integer> valores = new ArrayList<Integer>();

        valores.add(20);
        valores.add(14);
        valores.add(37);
        valores.add(89);
        valores.add(12);

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor : ");
        int valor = input.nextInt();

        int indice = valores.indexOf(valor);

        if (indice != -1){
            System.out.println("O valor encontra-se no indice número : " +indice);
        }else{
            System.out.println("Não está na lista!");
        }

    }
}

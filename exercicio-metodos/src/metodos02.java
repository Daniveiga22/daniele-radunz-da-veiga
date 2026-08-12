import java.util.Scanner;

public class metodos02 {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        //Exercício 02
        //Faça um metodo para seus colegas mais próximos
        //O metodo deve imprimir:
        //O nome dele(a) é [nome]
        //Ele(a) tem [idade] anos
        //Ele(a) é estudante de desenvolvimento de sistemas
        //(Em prints separados)
        //Faça com que o metodo seja uma expressão verbal com o nome do seu colega.
        //O usuário deve entrar com o nome da pessoa para escolher um dos métodos a ser
        //executado.

        System.out.println("Informe o nome de um Colega : ");
        String nome = input.next();

        //.equalsIgnoreCase ignora o formato em que é digitado o texto
        if (nome.equalsIgnoreCase("Hércules"))
        {
            imprimirhercules();
        }
        else if (nome.equalsIgnoreCase("Caio"))
        {
            imprimirCaio();
        } else if (nome.equalsIgnoreCase("Isabelli"))
        {
            imprimirIsabelli();
        }

        input.close();
    }

    public static void imprimirhercules (){
        System.out.println("O nome dele é Hércules Leonardo.");
        System.out.println("Ele tem 18 anos de idade.");
        System.out.println("Ele é aluno de Desenvolvimento de Sistemas.");
    }
    public static void imprimirCaio() {
        System.out.println("O nome dele é Caio.");
        System.out.println("Ele tem 18 anos de idade.");
        System.out.println("Ele é aluno de Desenvolvimento de Sistemas.");
    }
    public static void imprimirIsabelli () {
        System.out.println("O nome dele é Isabelli.");
        System.out.println("Ele tem 18 anos de idade.");
        System.out.println("Ela é aluno de Desenvolvimento de Sistemas.");
    }

}

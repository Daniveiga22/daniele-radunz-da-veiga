import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //Exercício 01
        // Escreva um programa que leia o número de matrícula de um funcionário,
        // seu nome, sua quantidade de horas trabalhadas na semana, o valor que recebe
        //por hora e calcule o salário mensal desse funcionário ( assuma que um meês tem 4 semnas)
        // A seguir, mostre a sua matrícula, nome e o salário do funcionário, com duas casas decimais.


        System.out.println("Informe o número da Matrícula : ");
        String matricula = input.next();

        System.out.println("Informe o nome : ");
        String nome = input.next();

        System.out.println("Informe a quantidade de Horas Trabalhadas : ");
        double hrsTrab = input.nextDouble();

        System.out.println("Informe o valor da Hora Trabalhada : ");
        double valorHr = input.nextDouble();

        double salario = (hrsTrab * valorHr)*4;

        System.out.println("Matrícula : " +matricula);
        System.out.println("Nome: " +nome);
        System.out.println("Salário Mensal " + df.format(salario));


        input.close();
    }
}


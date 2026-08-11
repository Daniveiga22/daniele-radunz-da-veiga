import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Exercicio 02
        //Faça um programa que leia o nome de um vendedor, o seu salário fixo
        //e o total de vendas efetuadas por ele no mês(em R$).
        //Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
        //informe o total a receber no final do mês, com duas casas decimais.

        System.out.println("Informe o nome do vendedor : ");
        String nome = input.next();

        System.out.println("Informe o valor do salário mensal : ");
        double salario = input.nextDouble();

        System.out.println("Informe o valor de vendas efetuadas no mês : ");
        double vendas = input.nextDouble();

        double comissao = (vendas*15)/100;
        double salarioFinal = salario + comissao;

        System.out.printf("Salário com Comissão : R$ " +"%.2f",salarioFinal);

        input.close();
    }
}

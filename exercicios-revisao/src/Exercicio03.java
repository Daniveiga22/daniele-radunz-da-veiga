import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Exercicio 03
        //O índice de massa corporal(IMC) é uma medida internacional usada para calcular
        //se uma pessoa está no peso ideal. O IMC é determinado pela divisão da massa do
        //individuo pelo quadrado de sua altura, onde a massa esta em quilogramas e a altura
        //esta em metros, de acordo com a fómula:
        //IMC = massa/(altura*altura)
        //Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do individuo,
        //de acordo com a seguinte tabela :
        // < 18.5 Magreza
        // 18.5 - 24.9 Saudavel
        // 25.0 - 29.9 Sobrepeso
        // 30.0 - 34.9 Obesidade Grau I
        // 35.0 - 39.9 Obesidade Grau II ( severa )
        // > 40.0 Obesidade Grau III ( morbida )

        System.out.println("Informe seu nome : ");
        String nome = input.next();

        System.out.println("Informe a sua altura : ");
        double altura  = input.nextDouble();

        System.out.println("Informe o seu peso : ");
        double peso = input.nextDouble();

        double imc = peso/ Math.pow(altura, 2);
        //Math.pow é o calculo de potencia nesse caso, era altura * altura

        if (imc < 18.5)
        {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc <= 24.9)
        {
            System.out.println("Saudável");
        } else if (imc >=25.0 && imc <= 29.9)
        {
            System.out.println("Sobrepeso");
        }else if (imc >= 30 && imc <=34.9)
        {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc <= 39.9)
        {
            System.out.println("Obesidade Grau II");
        } else
        {
            System.out.println("Obesidade Grau III (morbida)");
        }

        input.close();
    }
}

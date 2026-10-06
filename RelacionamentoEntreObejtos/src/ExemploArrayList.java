import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {

        List<Integer> idades = new ArrayList<Integer>(); //Array lista é um vetor com 50 posições (curiosidade)

        //para adicionar elementos a lista, coloca-se o nome da lista(nesse caso idades), adiciona-se ".add()" dentro do parenteses coloca-se a informação
        idades.add(18);
        idades.add(30);
        idades.add(25);
        idades.add(10);
        idades.add(26);
        idades.add(15);


        System.out.println(idades);//printa as informaçoes dentro do vetor
        System.out.println(idades.size());//.size é para saber quantos objetos tem dentro da lista
        System.out.println(idades.contains(25));//contains é ultilizado para saber se o que foi escrito dentro dos parenteses, tem no vetor, retornando como "true" ou "false"
        System.out.println(idades.indexOf(10));//retorna com o numero da posição do vetor aonde o numero se encontra, caso nao encontre ele retorna como "-1"
        System.out.println(idades.getLast());//retorna com o ultimo numero do vetor
        System.out.println(idades.getFirst());//retonr com o primeiro numero do vetor

        Collections.sort(idades); // "ordena" a lista (sort é o que ordena)

        System.out.println(idades);// quando é chamado para informar os numeros do vetor, ele retorna com a lista ordenada

        System.out.println("Informe um valor, paa verificar se esta na lista");

    }
}

public class ClassePrincipal {

    public static void main(String[] args) {

        Quadrilatero q1 = new Quadrilatero();
        q1.altura = 2;
        q1.largura = 4;

        System.out.println(q1.obterPerimetro());


        Quadrilatero q2 = new Quadrilatero();
        q2.altura = 8;
        q2.largura = 3;

        System.out.println(q2.obterPerimetro());

    }
}

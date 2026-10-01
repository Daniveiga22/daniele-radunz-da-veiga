public class Ex10 {

    public static void main(String[] args) {

        Livro v1 = new Livro("O que as pessoas fortes não fazem", false);
        Livro v2 = new Livro("Duna", true);

        v1.emprestar();
        System.out.println(v1);

        v2.devolver();
        System.out.println(v2);
    }
}

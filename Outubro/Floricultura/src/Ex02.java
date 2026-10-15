public class Ex02 {
    public static void main(String[] args) {

        Floricultura f1 = new Floricultura("Margarida", 49.99, "Antonio");
        Floricultura f2 = new Floricultura("Violeta", 4.99, "Rosana");
        Floricultura f3 = new Floricultura("Lírio", 79.99, "Josemar");
        Floricultura f4 = new Floricultura("Orquídea", 109.99, "Rosana");

        FloriculturaPrincipal p1 = new FloriculturaPrincipal();

        p1.adicionarFlor(f1);
        p1.adicionarFlor(f2);
        p1.adicionarFlor(f3);
        p1.adicionarFlor(f4);

        System.out.println(p1.pesquisarFlores("Rosana"));


    }
}



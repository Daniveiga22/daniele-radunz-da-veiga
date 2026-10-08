public class Ex01 {
    public static void main(String[] args) {

        Retangulo r1 = new Retangulo(5,4);
        Retangulo r2 =  new Retangulo(18,1);

        ListaRetangulo f1 = new ListaRetangulo();

        f1.adicionarRetangulo(r1);
        f1.adicionarRetangulo(r2);

        System.out.println(f1.obterRetanguloMaiorArea());
        System.out.println(f1.obterRetanguloMaiorPerimetro());
    }
}

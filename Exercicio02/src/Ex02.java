public class Ex02 {
    public static void main(String[] args) {

        Mercado unidadeDeBlumenau = new Mercado();

        unidadeDeBlumenau.nomeMercado = "Mercado Blumenau";
        unidadeDeBlumenau.macaAno = 5000;
        unidadeDeBlumenau.precoMaca = 1.20;
        unidadeDeBlumenau.laranjaAno = 4200;
        unidadeDeBlumenau.precoLaranja = 0.90;

        System.out.println(unidadeDeBlumenau.nomeMercado + " venderam " +unidadeDeBlumenau.macaAno + " maças á R$" +unidadeDeBlumenau.precoMaca);

        Mercado unidadeDeJoinville = new Mercado();

        unidadeDeJoinville.nomeMercado = "SuperMercado Joinville";
        unidadeDeJoinville.macaAno = 1000;
        unidadeDeJoinville.precoMaca = 1.30;
        unidadeDeJoinville.laranjaAno = 100;
        unidadeDeJoinville.precoLaranja = 0.80;

        System.out.println(unidadeDeJoinville.nomeMercado + " venderam " +unidadeDeJoinville.macaAno + " maças á R$ " +unidadeDeJoinville.precoMaca);

        Mercado unidadeDeFlorianopolis = new Mercado();

        unidadeDeFlorianopolis.nomeMercado = "Ilha Bela";
        unidadeDeFlorianopolis.macaAno = 500;
        unidadeDeFlorianopolis.precoMaca = 1.50;
        unidadeDeFlorianopolis.laranjaAno = 2000;
        unidadeDeFlorianopolis.precoLaranja = 3.00;

        System.out.println(unidadeDeFlorianopolis.nomeMercado + " venderam " +unidadeDeFlorianopolis.macaAno + " maças á R$ " +unidadeDeFlorianopolis.precoMaca);

    }
}

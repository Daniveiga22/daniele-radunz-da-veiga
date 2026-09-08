public class Ex04 {

    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();
        Circulo c3 = new Circulo();
        Circulo c4 = new Circulo();

        c1.raio = 1;
        c2.raio = 5;
        c3.raio = 4;
        c4.raio = 2.5;

        System.out.println(c4.calcularArea());

    }
}

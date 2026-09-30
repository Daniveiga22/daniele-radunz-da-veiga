public class Ex09 {
    public static void main(String[] args) {

        Velocidade c1 = new Velocidade(50);

        System.out.println(c1.getVelocidade());

        c1.acelerar(5);

        System.out.println(c1.getVelocidade());

        c1.reduzir(15);
        System.out.println(c1.getVelocidade());
    }


}

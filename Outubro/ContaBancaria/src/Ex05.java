public class Ex05 {
    public static void main(String[] args) {

        Conta c1 = new Conta("Dionei", 200000.00);
        Conta c2 = new Conta("Samia", 100.00);
        Conta c3 = new Conta("Ana Marta", 50000.00);
        Conta c4 = new Conta("Sandrinha", 50.00);

        c1.valorDepositar(400);
        c1.valorASacar(500);

        System.out.println(c1);

        c1.valorTransferir(c2, 500);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c2.investimento(500,10));




    }
}

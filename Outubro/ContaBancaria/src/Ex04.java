public class Ex04 {
    public static void main(String[] args) {

        Conta c1 = new Conta("Dionei", 200000.00);
        Conta c2 = new Conta("Samia", 100.00);
        Conta c3 = new Conta("Ana Marta", 50000.00);
        Conta c4 = new Conta("Sandrinha", 50.00);

        ContaBancaria cb1 = new ContaBancaria();

        cb1.adicionarContas(c1);
        cb1.adicionarContas(c2);
        cb1.adicionarContas(c3);
        cb1.adicionarContas(c4);

        System.out.println();


    }
}

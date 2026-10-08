public class ClassePrincipal {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Honda", "Civic", "XXX1X11", 2010, 45000.0);
        Veiculo v2 = new Veiculo("Nissan", "Kicks", "RLA6C21", 2021, 89000.0);
        Veiculo v3 = new Veiculo("Volkswagen", "Polo", "MDR8911",2003, 19900.0);
        Veiculo v4 = new Veiculo("Suzuki", "SX4", "MIL1172", 2003, 29900.0);

        Concessionaria c1 = new Concessionaria();

        c1.adicionarVeiculo(v1);
        c1.adicionarVeiculo(v2);

        System.out.println(c1.obterVeiculoMaisBarato());

        Concessionaria c2 = new Concessionaria();

        c2.adicionarVeiculo(v3);
        c2.adicionarVeiculo(v4);

        System.out.println(c2.obterVeiculoMaisBarato());

    }
}

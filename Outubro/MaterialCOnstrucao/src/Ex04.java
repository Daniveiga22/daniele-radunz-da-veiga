public class Ex04 {

    public static void main(String[] args) {



        Material m1 = new Material("Tigre", "Cano PVC", 19.99, 50);
        Material m2 = new Material("FortLev", "Caixa D'Agua 1000l", 450.00, 10);
        Material m3 = new Material("Gerdau","Pct Pregos", 19.99, 45);
        Material m4 = new Material("Tigre", "Caixa D'Agua 1000l", 429.99, 15);
        Material m5 = new Material("Tigre", "Caixa D'Agua 500l", 249.99, 12);

        //m1.aumentarQuantidadeDoEstoque(5);
        //m1.venderProdutos(10);
        //System.out.println(m1);


        MateriaisDeConstrucao e1 = new MateriaisDeConstrucao();

        e1.adicionarMaterial(m1);
        e1.adicionarMaterial(m2);
        e1.adicionarMaterial(m3);
        e1.adicionarMaterial(m4);
        e1.adicionarMaterial(m5);

        System.out.println(e1.retornarProdutoMaisCaro("Tigre"));

        System.out.println(e1.retornarProdutosDeterminadoPreco(2, 200, "Tigre"));

    }
}

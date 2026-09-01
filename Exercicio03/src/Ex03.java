public class Ex03 {
    public static void main(String[] args) {

      Produto produto1 = new Produto();

      produto1.nomeProduto = "Caderno";
      produto1.descricaoProduto = "Caderno em espiral tamanho médio.";
      produto1.precoUnitario = 4.50;
      produto1.desconto = 15;

      System.out.println(produto1.nomeProduto + " =  " +produto1.descricaoProduto+" com valor de R$ "+produto1.precoUnitario+ " com desconto de "+produto1.desconto+" %.");


      Produto produto2 = new Produto();
      produto2.nomeProduto = "Caneta ESF";
      produto2.descricaoProduto = " Caneta Esferográfica 5mm";
      produto2.precoUnitario = 1.2;
      produto2.desconto = 2;

      System.out.println(produto2.nomeProduto + " =  " +produto2.descricaoProduto+" com valor de R$ "+produto2.precoUnitario+ " com desconto de "+produto2.desconto+" %.");

      Produto produto3 = new Produto();
      produto3.nomeProduto = "Esquadro";
      produto3.descricaoProduto = "Esquadro de acrílico 20 cm";
      produto3.desconto = 10;

      System.out.println(produto3.nomeProduto + " =  " +produto3.descricaoProduto+" com valor de R$ "+produto3.precoUnitario+ " com desconto de "+produto3.desconto+" %.");


    }

}

import java.util.ArrayList;
import java.util.List;

public class MateriaisDeConstrucao {

     private List<Material> materiais;

     public MateriaisDeConstrucao(){
          materiais = new ArrayList<Material>();
     }
     public void adicionarMaterial(Material m) {
          materiais.add(m);
     }

     // Na classe materiais de construção crie metdodos para obter:
     // o produto mais caro de uma determinada marca;


     public Material retornarProdutoMaisCaro (String marca) {
          Material retornarProdutoMaiorCaro = null;
          double materialMaisCaro = Double.MIN_VALUE;

          for (Material m : materiais) {
               if (marca.equals(m.getMarca()) && m.getPreco() > materialMaisCaro) {
                    retornarProdutoMaiorCaro = m;
                    materialMaisCaro = m.getPreco();
               }
          }
          return retornarProdutoMaiorCaro;
     }


     // todos os produtos de uma determinada marca cujo preço esteja entre um intervalo de X e Y.

     public List<Material> retornarProdutosDeterminadoPreco (double precoInicial, double precoFinal, String marca) {
          List< Material> buscarEstoque = new ArrayList<>();

          for (Material m : materiais) {
               if (marca.equals(m.getMarca()) && m.getPreco() >= precoInicial && m.getPreco() <= precoFinal) {
                    buscarEstoque.add(m);
               }
          }
          return buscarEstoque;
     }
}

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


     public List<Material> retornarProdutoMaisCaro (String marca, double preco){
          List<Material> materialMaisCaro = new ArrayList<Material>();

          for (Material m : materiais) {

               if (m.getMarca().equals(marca) && m.getPreco() >= preco) {
                    materialMaisCaro.add(m);
               }
          }
          return materialMaisCaro;
     }


     // todos os produtos de uma determinada marca cujo preço esteja entre um intervalo de X e Y.

     public List<Material> retornarProdutosDeterminadoPreco (String marca){
          List<Material>produtoDeterminadaMarca = new ArrayList<Material>();

          for(Material m : materiais) {

               if (m.getMarca().equals(marca) && m.getPreco() <= 200 && m.getPreco() >=500){
                    produtoDeterminadaMarca.add(m);
               }
          }
          return produtoDeterminadaMarca;
     }

}

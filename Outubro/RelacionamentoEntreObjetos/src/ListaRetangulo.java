import java.util.ArrayList;
import java.util.List;

public class ListaRetangulo {

    private List<Retangulo> retangulos;

    public ListaRetangulo() {
        retangulos = new ArrayList<Retangulo>();
    }

    public void adicionarRetangulo(Retangulo r) {
        retangulos.add(r);
    }

    public Retangulo obterRetanguloMaiorArea(){
        double maiorArea = Double.MIN_VALUE;

        Retangulo maiorAreaRetangulo = null;

        for (Retangulo r : retangulos) {
            if(r.calcularArea() > maiorArea){
                maiorArea = r.calcularArea();
                maiorAreaRetangulo = r;
            }
        }
        return maiorAreaRetangulo;
    }
    public Retangulo obterRetanguloMaiorPerimetro(){
        double maiorPerimentro = Double.MIN_VALUE;

        Retangulo maiorPerimetroRetangulo = null;

        for (Retangulo r : retangulos) {
            if(r.calcularPerimetro() > maiorPerimentro){
                maiorPerimentro = r.calcularPerimetro();
                maiorPerimetroRetangulo = r;
            }
        }
        return maiorPerimetroRetangulo;
    }





}

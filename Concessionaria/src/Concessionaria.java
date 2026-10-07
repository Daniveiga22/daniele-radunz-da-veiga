import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

private List<Veiculo> veiculos;

public Concessionaria(){
    veiculos = new ArrayList<Veiculo>();
}

public void adicionarVeiculo(Veiculo v) {
    veiculos.add(v);
}

public Veiculo obterVeiculoMaisCaro()
{
    double maiorPreco = 0;
    Veiculo veiculoMaisCaro = null;

    for (Veiculo v : veiculos){
        if(v.getPreco() > maiorPreco){
            maiorPreco = v.getPreco();
            veiculoMaisCaro = v;
        }
    }

    return veiculoMaisCaro;
}


}

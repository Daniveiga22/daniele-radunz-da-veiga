import java.util.ArrayList;
import java.util.List;

public class FloriculturaPrincipal {


    private List<Floricultura> flores;

    public FloriculturaPrincipal(){
        flores = new ArrayList<Floricultura>();

    }

    public void adicionarFlor(Floricultura f){
        flores.add(f);
    }

    public List<Floricultura> pesquisarFlores(String cliente){
        List<Floricultura> floresPesquisa = new ArrayList<Floricultura>();

        for(Floricultura f : flores){

            if (f.getCliente().equals(cliente)){
                floresPesquisa.add(f);
            }
        }


        return floresPesquisa;
    }




}

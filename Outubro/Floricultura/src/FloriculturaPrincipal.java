import java.util.ArrayList;

public class FloriculturaPrincipal {


    private List<Floricultura> flores;

    public FloriculturaPrincipal(){
        flores = new ArrayList<Floricultura>();

    }

    public void adicionarCompra(Floricultura f){
        Floricultura.add(f);
    }

}

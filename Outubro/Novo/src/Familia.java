import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Familia {

    private List<Pessoa> listaPessoas;

    public Familia (){
        listaPessoas = new ArrayList<Pessoa>();

    }

    public void adicionarPessoa (Pessoa p){
        listaPessoas.add(p);
    }

    public Pessoa encontrarPessoaMaisVelha(){

        LocalDate dataMaisVelha = LocalDate.now();

        Pessoa pessoaMaisVelha = null;

        for (Pessoa p : listaPessoas){
            if (p.getDataNascimento().isBefore(dataMaisVelha)){
                dataMaisVelha = p.getDataNascimento();
                pessoaMaisVelha = p;
            }
        }
        return pessoaMaisVelha;
    }
}

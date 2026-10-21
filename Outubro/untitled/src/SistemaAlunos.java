import java.util.ArrayList;
import java.util.List;

public class SistemaAlunos {

    private List<Alunos> alunos;

    public SistemaAlunos() {
        alunos = new ArrayList<Alunos>();

    }

    public void adicionarAlunos(Alunos a) {
        alunos.add(a);
    }

    public List<Alunos> retornarAlunosCursoMediaIdade(String curso, int idade, double media) {
        List<Alunos> alunosPesquisa = new ArrayList<Alunos>();

        for (Alunos a : alunos) {

            if (a.getCurso().equals(curso) && a.getIdade() >= idade && a.getMediaFinal()> media) {
                alunosPesquisa.add(a);
            }
        }
        return alunosPesquisa;

    }
    public Alunos obterAlunoPorMatricula(String matricula){

        for (Alunos a : alunos){
            if (a.getMatricula().equals(matricula)){
                return a;

            }
        }
        return null;

    }

}
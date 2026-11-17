import java.time.LocalDate;
import java.time.Period;

public class Usuario {

    private LocalDate dataNascimento;

    public Usuario(LocalDate dataNascimento) {
        setDataNascimento(dataNascimento);
    }
    public boolean determinarMaiorIdade(){
        int idade = Period.between(dataNascimento, LocalDate.now()).getYears();

        if (idade >= 18){
            return true;
        } else {
            return false;
        }
        //metodo resumido
        // public boolean determinarMaiorIdade(){
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if(dataNascimento == null || dataNascimento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data de Nascimento é Inválida!");
        }
        this.dataNascimento = dataNascimento;
    }

     @Override
    public String toString() {
        return "Usuario{" +
                "dataNascimento=" + dataNascimento +
                '}';
    }
}

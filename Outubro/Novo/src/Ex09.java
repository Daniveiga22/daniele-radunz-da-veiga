import java.time.LocalDate;

public class Ex09 {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Carla", LocalDate.of(2012, 07, 22));
        Pessoa p2 = new Pessoa("Antony", LocalDate.of(2014, 03,22));

        Familia f1 = new Familia();

        f1.adicionarPessoa(p1);
        f1.adicionarPessoa(p2);

        System.out.println(f1.encontrarPessoaMaisVelha());
    }
}

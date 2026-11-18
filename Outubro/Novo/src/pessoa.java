import java.time.LocalDate;

public class pessoa{

    // 9) Classe Família
    // - listaPessoas: List<Pessoas>
    // + adicionarPessoas(Pessoa): void
    // + encontrarPessoaMaisVelha(): Pessoa

    // Pessoa
    // - nome: String
    // - dataNascimento : LocalDate

    // Familia
    // O metodo adiconarPessoa deve adicionar uma pessoa a ArrayList de Familia
    // O metodo encontrarPessoaMaisVelha deve encontrar a pessoa mais velha da Familia

   private String nome;
   private LocalDate dataNascimento;

   public pessoa(String nome, LocalDate dataNascimento) {
      setNome(nome);
      setDataNascimento(dataNascimento);
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
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
      return "pessoa{" +
              "nome='" + nome + '\'' +
              ", dataNascimento=" + dataNascimento +
              '}';
   }
}

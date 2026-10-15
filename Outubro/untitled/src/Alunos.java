public class Alunos {

    String nome;
    int idade;
    String matricula;
    String curso;
    double mediaFinal;

    public Alunos(String nome, int idade, String matricula, String curso, double mediaFinal) {
        setNome(nome);
        setIdade(idade);
        setMatricula(matricula);
        setCurso(curso);
        setMediaFinal(mediaFinal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome informado é Inválido!");
        }

        this.nome = nome;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {
        if (idade <=0){
            throw new IllegalArgumentException("Idade Informada é Inválida!");
        }

        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isBlank() ) {
            throw new IllegalArgumentException("Matrícula Inválida!");
        }
        this.matricula = matricula;
    }

    public String getCurso() {

        return curso;
    }

    public void setCurso(String curso) {
        if (curso == null || curso.isBlank()){
            throw new IllegalArgumentException("Curso Informado é Inválido!");
        }
        this.curso = curso;
    }

    public double getMediaFinal() {

        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {

        this.mediaFinal = mediaFinal;
    }
}

public class Funcionario {

    String identificacao;
    String nome;
    String sobrenome;
    double salario;

    public double multiplicarSalario(){
        return salario*12;
    }

    public String obterNomeCompleto(){
        return nome + sobrenome;
    }

    public double modificarSalario(){
        return ((salario*10)/100)+salario;
    }

}

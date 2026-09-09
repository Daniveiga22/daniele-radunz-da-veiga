public class Ex05 {
    public static void main(String[] args) {

    Funcionario f1 = new Funcionario();
    f1.identificacao = "251322072203";
    f1.nome = "Maria";
    f1.sobrenome = "Veiga";
    f1.salario = 1500;

        System.out.println(f1.calcularSalarioAnual());
        System.out.println(f1.obterNomeCompleto());
        f1.aumentarSalario(5);
        System.out.println(f1.salario);
    }
}

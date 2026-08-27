public class Feminino {
    public static void main(String[] args) {

        Usuario fem = new Usuario();

        fem.nome = "Joana";
        fem.sexo = 'f';
        fem.dataDeNascimento = "26-08-2026";
        fem.estadoCivil = "solteira";

        System.out.println(fem.nome + " " +fem.dataDeNascimento);

        Usuario masc = new Usuario();

        masc.nome = "Heitor";
        masc.sexo = 'm';
        masc.dataDeNascimento = "26-02-2026";
        masc.estadoCivil = "casado";

        System.out.println(masc.nome + " " +masc.dataDeNascimento);

    }
}

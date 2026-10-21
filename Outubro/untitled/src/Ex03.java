public class Ex03 {

    public static void main(String[] args) {

        Alunos a1 = new Alunos("Adrian", 15, "ADM001", "Artes", 9);
        Alunos a2 = new Alunos("Anna", 16, "ADF001", "Biologia", 8);
        Alunos a3 = new Alunos("Bruno", 18, "ADM002", "Matemática", 6);
        Alunos a4 = new Alunos("Clara", 18, "ADF002","Artes", 8.5);


        SistemaAlunos s1 = new SistemaAlunos();

        s1.adicionarAlunos(a1);
        s1.adicionarAlunos(a2);
        s1.adicionarAlunos(a3);
        s1.adicionarAlunos(a4);

        System.out.println(s1.retornarAlunosCursoMediaIdade("Artes", 18, 6));

        System.out.println(s1.obterAlunoPorMatricula("ADM001"));


    }
}

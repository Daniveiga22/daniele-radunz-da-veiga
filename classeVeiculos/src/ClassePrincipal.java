public class ClassePrincipal {
    public static void main(String[] args) {

        veiculo v1 = new veiculo();

        v1.marca = "Honda";
        v1.modelo = "Civic";
        v1.placa = "xxx1xx11";
        v1.ano = 2010;
        v1.preco = 50000;

        System.out.println(v1.marca + " " + v1.modelo);

        veiculo v2 = new veiculo();

        v2.marca = "Nissan";
        v2.modelo = "Kicks";
        v2.placa = "xxx2xx11";
        v2.ano = 2023;
        v2.preco = 80000;

        System.out.println(v2.marca + " " + v2.modelo);
    }
}

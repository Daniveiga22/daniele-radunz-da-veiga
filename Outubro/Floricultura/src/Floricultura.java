public class Floricultura {

    private String nome;
    private double preco;
    private String cliente;

    public Floricultura(String nome, double preco, String cliente) {
        setNome(nome);
        setPreco(preco);
        setCliente(cliente);
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

    public double getPreco() {

        return preco;
    }

    public void setPreco(double preco) {
        if (preco <=0 ){
            throw new IllegalArgumentException("Valor Informado esta Incorreto!")
        }

        this.preco = preco;
    }

    public String getCliente() {

        return cliente;
    }

    public void setCliente(String cliente) {
        if (cliente == null || cliente.isBlank()){
            throw new IllegalArgumentException("Nome Inválido!");
        }

        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Floricultura{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", cliente='" + cliente + '\'' +
                '}';
    }
}

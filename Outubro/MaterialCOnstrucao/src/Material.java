public class Material {

    private String marca;
    private String modelo;
    private double preco;
    private int quantidadeEmEstoque;

    public Material(String marca, String modelo, double preco, int quantidadeEmEstoque) {
        setMarca(marca);
        setModelo(modelo);
        setPreco(preco);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {

        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Marca Informado é Inválido!");
        }this.marca = marca;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {

        if (modelo == null || modelo.isBlank()){
            throw new IllegalArgumentException("Modelo Informado é Inválido!");
        }
            this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <=0){
            throw new IllegalArgumentException("Valor Informado é Inválido!");
        }
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "Material{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                '}';
    }
    public void adicionarEstoque(int adicionar){
        if(adicionar <= 0){
            throw new IllegalArgumentException("Quantidade Informada é Inválida!");
        }
        quantidadeEmEstoque = quantidadeEmEstoque + adicionar;
        //quantidadeEmEstoque += vender
    }

    public void venderProdutos ( int vender){
        if(vender > quantidadeEmEstoque){
            throw new IllegalArgumentException("Quantidade Informada, excede o Estque!");
        }
        quantidadeEmEstoque = quantidadeEmEstoque - vender;
        // quantidadeEmEstoque-= vender
    }
}

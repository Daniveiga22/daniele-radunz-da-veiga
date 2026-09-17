public class Aeronave {

    private String modelo;
    private int numeroPassageiros;
    private double velocidadeMaxima;
    private double capacidadeCombustivel;
    private double queimaCombustivelPorMinuto;

    @Override
    public String toString() {
        return "Aeronave{" +
                "modelo='" + modelo + '\'' +
                ", numeroPassageiros=" + numeroPassageiros +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", CapacidadeCombustivel=" + capacidadeCombustivel +
                ", QueimaCombustivelPorMinuto=" + queimaCombustivelPorMinuto +
                '}';
    }

    public double getQueimaCombustivelPorMinuto() {
        return queimaCombustivelPorMinuto;
    }

    public void setQueimaCombustivelPorMinuto(double queimaCombustivelPorMinuto) {
        this.queimaCombustivelPorMinuto = queimaCombustivelPorMinuto;
    }

    public Aeronave(String modelo, int numeroPassageiros, double velocidadeMaxima, double capacidadeCombustivel, double queimaCombustivelPorMinuto) {
        setModelo(modelo);
        setNumeroPassageiros(numeroPassageiros);
        setVelocidadeMaxima(velocidadeMaxima);
        setCapacidadeCombustivel(capacidadeCombustivel);
        setQueimaCombustivelPorMinuto(queimaCombustivelPorMinuto);

    }
    public double calcularTempoVoo(){
        return capacidadeCombustivel / queimaCombustivelPorMinuto;
    }

    public double calcularDistMax(){
        return velocidadeMaxima * (calcularTempoVoo() / 60);
    }

    // para aplicar o getter e setter alt+insert+getter and setter
    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            System.out.println("Erro, Modelo de Aeronave informado é Inválido!");
        }else {

            this.modelo = modelo;
        }
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        if (numeroPassageiros < 0){
            System.out.println("Erro! Quantidade de Passageiros informada, é Inválida!");
        }else {
            this.numeroPassageiros = numeroPassageiros;
        }
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }



}

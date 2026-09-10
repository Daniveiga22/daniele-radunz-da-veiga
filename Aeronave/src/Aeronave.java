public class Aeronave {

    String modelo;
    int numeroPassageiros;
    double velocidadeMaxima;
    double capacidadeCombustivel;
    double queimaCombustivelPorMinuto;

    @Override
    public String toString() {
        return "Aeronave{" +
                "modelo='" + modelo + '\'' +
                ", numeroPassageiros=" + numeroPassageiros +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", capacidadeCombustivel=" + capacidadeCombustivel +
                ", queimaCombustivelPorMinuto=" + queimaCombustivelPorMinuto +
                '}';
    }

    public Aeronave(String modelo, int numeroPassageiros, double velocidadeMaxima, double capacidadeCombustivel, double queimaCombustivelPorMinuto) {
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivelPorMinuto = queimaCombustivelPorMinuto;



    }
}

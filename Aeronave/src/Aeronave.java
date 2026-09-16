public class Aeronave {

    String modelo;
    int numeroPassageiros;
    double velocidadeMaxima;
    double capacidadeCombustivel;
    double queimaCombustivelPorMinuto;


    //Alt+Insert = clica no "toString"
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
    // a) Qual aeronave leva o maior número de passageiros?
    //essa questao nao necessita de um metodo

    // b) Qual das aeronaves pode ficar mais tempo no ar?

    public double calcularConsumoCombustivel(){
        return capacidadeCombustivel / queimaCombustivelPorMinuto;
    }
    public double calcularTempoDeVoo(){
        return calcularConsumoCombustivel() / 60;
    }

    // c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe?

    public double maiorDistanciaPercorrida(){
        return  calcularTempoDeVoo() * velocidadeMaxima;
    }

    //Alt+Insert = clica no "Construtor"
    public Aeronave(String modelo, int numeroPassageiros, double velocidadeMaxima, double capacidadeCombustivel, double queimaCombustivelPorMinuto) {
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivelPorMinuto = queimaCombustivelPorMinuto;
    }


}

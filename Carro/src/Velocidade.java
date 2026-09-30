public class Velocidade {

    private double velocidade;

    public Velocidade(double velocidade) {
        setVelocidade(velocidade);
    }

    public void acelerar(double aceleracao){
        if (aceleracao < 0 || aceleracao >= 20) {
            throw new IllegalArgumentException("Aceleração Inválida!");
        }
        setVelocidade(velocidade + aceleracao);
    }

    public void reduzir(double reducao){
        if (reducao < 0 || reducao >= 30) {
            throw new IllegalArgumentException("Redução Inválida!");

        }
        setVelocidade(velocidade - reducao);
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade < 0){
            throw new IllegalArgumentException("Velocidade não pode ser negativa!");
        }
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Velocidade{" +
                "velocidade=" + velocidade +
                '}';
    }
}

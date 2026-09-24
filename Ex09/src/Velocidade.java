public class Velocidade {

    private double velocidade;
    private double aumentar;
    private double reduzir;

    public Velocidade(double velocidade, double aumentar, double reduzir) {
        setVelocidade(velocidade);
        setAumentar(aumentar);
        setReduzir(reduzir);
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAumentar() {
        return aumentar;
    }

    public void setAumentar(double aumentar) {
        this.aumentar = aumentar;
    }

    public double getReduzir() {
        return reduzir;
    }

    public void setReduzir(double reduzir) {
        this.reduzir = reduzir;
    }

    @Override
    public String toString() {
        return "Velocidade{" +
                "velocidade=" + velocidade +
                ", aumentar=" + aumentar +
                ", reduzir=" + reduzir +
                '}';
    }

    public double somarVelocidade(){
        return velocidade + aumentar;

    }
}

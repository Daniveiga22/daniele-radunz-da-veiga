public class Mercado {
    String nomeMercado;

    int macasVendidasAno;

    double precoMaca;

    int laranjaVendidasAno;

    double precoLaranja;

    public Mercado(String nomeMercado, int macasVendidasAno, double precoMaca, int laranjaVendidasAno, double precoLaranja) {
        this.nomeMercado = nomeMercado;
        this.macasVendidasAno = macasVendidasAno;
        this.precoMaca = precoMaca;
        this.laranjaVendidasAno = laranjaVendidasAno;
        this.precoLaranja = precoLaranja;
    }


    public double calcularReceitaMaca(){
        return macasVendidasAno * precoMaca;
    }

    public double calcularReceitaLaranjas(){
        return laranjaVendidasAno * precoLaranja;
    }

    public double calcularReceitaTotal() {
        //return (macasVendidasAno * precoMaca) + (laranjaVendidasAno * precoLaranja);
        return calcularReceitaMaca() + calcularReceitaLaranjas();
        //pode-se usar os metodos criados anteriormente
    }

    @Override
    public String toString() {
        return "Mercado{" +
                "nomeMercado='" + nomeMercado + '\'' +
                ", macasVendidasAno=" + macasVendidasAno +
                ", precoMaca=" + precoMaca +
                ", laranjaVendidasAno=" + laranjaVendidasAno +
                ", precoLaranja=" + precoLaranja +
                '}';
    }
}

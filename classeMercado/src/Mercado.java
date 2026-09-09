public class Mercado {

    String nomeMercado;
    int macasVendidasAno;
    double precoMaca;
    int laranjaVendidasAno;
    double precoLaranja;

    public double calcularReceitaMaca(){
        return macasVendidasAno * precoMaca;
    }

    public double calcularReceitaLaranjas(){
        return laranjaVendidasAno * precoLaranja;
    }

    public double calcularReceitaTotal(){
        //return (macasVendidasAno * precoMaca) + (laranjaVendidasAno * precoLaranja);
        return calcularReceitaMaca() + calcularReceitaLaranjas();
        //pode-se usar os metodos criados anteriormente
    }
}

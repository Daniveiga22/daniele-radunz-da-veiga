public class Ex07throw {
    public static void main(String[] args) {

        Aeronave Boeing737 = new Aeronave("Boeing 737", 189, 946, 26020, 45.0);
        Aeronave Airbus = new Aeronave("Airbus", 181, 871, 24210, 44.0);
        Aeronave Boeing777 = new Aeronave("Boeing 777", 550, 945, 181280, 160.0);
        Aeronave Embraer = new Aeronave("Embraer", 146, 871, 21900, 35.0);

        Aeronave aeronaves[] = {Boeing737,Airbus,Boeing777,Embraer};

        Boeing777.setNumeroPassageiros(-50);
        Boeing777.setModelo("    ");

        Aeronave maiorCapacidadePassageiros = aeronaves[0];

        for (int i = 0; i < aeronaves.length; i++) {
            if (aeronaves[i].getNumeroPassageiros() > maiorCapacidadePassageiros.getNumeroPassageiros()) {
                maiorCapacidadePassageiros = aeronaves[i];
            }
        }

        System.out.println(maiorCapacidadePassageiros.getNumeroPassageiros());

        //Qual das aeronaves pode ficar mais tempo no ar?

        double maiorAutonomia = 0;
        Aeronave aeronaveMaiorAutonomia = null;

        for (int i = 0; i < aeronaves.length; i++) {
            if (aeronaves[i].calcularTempoVoo() > maiorAutonomia) {
                maiorAutonomia = aeronaves[i].calcularTempoVoo();
                aeronaveMaiorAutonomia = aeronaves[i];
            }
        }

        System.out.println(aeronaveMaiorAutonomia);



        //Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe?

        double maiorDistancia = 0;
        Aeronave aeronaveMaiorDistancia = null;

        for (int i = 0; i < aeronaves.length; i++){
            if (aeronaves[i].calcularDistMax() > maiorDistancia){
                maiorDistancia = aeronaves[i].calcularDistMax();
                aeronaveMaiorDistancia = aeronaves[i];
            }
        }
        System.out.println(aeronaveMaiorDistancia);
    }
}

public class Ex07 {
    public static void main(String[] args) {


        Aeronave Boeing737 = new Aeronave("Boeing 737", 189, 946, 26020, 45.0);

        Aeronave Airbus = new Aeronave("Airbus", 181, 871, 24210, 44.0);

        Aeronave Boeing777 = new Aeronave("Boeing 777", 550, 945, 181280, 160.0);

        Aeronave Embraer = new Aeronave("Embraer", 146, 871, 21900, 35.0);

        Aeronave aeronaves[] = {Boeing737,Airbus,Boeing777,Embraer};


        // Qual aeronave leva o maior numero de passageiros?
        double maiorPassageiros = 0;
        Aeronave aeronaveMaiorPassageiros = null;

        for (int i = 0; i < aeronaves.length; i++){
            if (aeronaves[i].numeroPassageiros>maiorPassageiros){
                maiorPassageiros=aeronaves[i].numeroPassageiros;
                aeronaveMaiorPassageiros = aeronaves[i];
            }

        }
        System.out.println(aeronaveMaiorPassageiros);

        //Qual das aeronaves pode ficar mais tempo no ar?

        double maiorAutonomia = 0;
        Aeronave aeronaveMaiorAutonomia = null;

        for (int i = 0; i < aeronaves.length; i++) {
            if (aeronaves[i].calcularTempoDeVoo() > maiorAutonomia) {
                maiorAutonomia = aeronaves[i].calcularTempoDeVoo();
                aeronaveMaiorAutonomia = aeronaves[i];
            }
        }

        System.out.println(aeronaveMaiorAutonomia);



        //Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe?

        double maiorDistancia = 0;
        Aeronave aeronaveMaiorDistancia = null;

        for (int i = 0; i < aeronaves.length; i++){
            if (aeronaves[i].maiorDistanciaPercorrida() > maiorDistancia){
                maiorDistancia = aeronaves[i].maiorDistanciaPercorrida();
                aeronaveMaiorDistancia = aeronaves[i];
            }
        }
        System.out.println(aeronaveMaiorDistancia);


    }
}

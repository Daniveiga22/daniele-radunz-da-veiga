public class Ex07 {
    public static void main(String[] args) {


        Aeronave Boeing737 = new Aeronave("Boeing 737", 189, 946, 26020, 45.0);

        Aeronave Airbus = new Aeronave("Airbus", 181, 871, 24210, 44.0);

        Aeronave Boeing777 = new Aeronave("Boeing 777", 550, 945, 181280, 160.0);

        Aeronave Embraer = new Aeronave("Embraer", 146, 871, 21900, 35.0);

        Aeronave aeronaves[] = {Boeing737,Airbus,Boeing777,Embraer};


        // Qual aeronave leva o maior numero de passageiros?
        for (int i = 0; i < aeronaves.length; i++){
            System.out.println();

        }

        //Qual das aeronaves pode ficar mais tempo no ar?
        System.out.println();

        //Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe?











    }
}

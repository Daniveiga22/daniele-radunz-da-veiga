import java.time.LocalDate;
import java.time.Period;

public class ExemploDatas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);

        LocalDate dataNascimentoDani = LocalDate.of(1989,01,25);
        LocalDate dataNascimentoHenrique = LocalDate.of(2001,10,11);


        if (dataNascimentoHenrique.isBefore(dataNascimentoDani)){
            System.out.println("Dani é mais nova.");
        } else {
            System.out.println("Henrique é mais novo.");
        }
            int idadeHenrique = Period.between(dataNascimentoHenrique, hoje).getYears();

        System.out.println("O Henrique tem "+ idadeHenrique + " anos.");

    }
}

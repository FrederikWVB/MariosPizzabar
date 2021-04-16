import java.util.ArrayList;
import java.util.Scanner;

    /* Når programmet vises, skal det være muligt at vælge om man blot vil se menuen eller vil gå igang med at lave ordreliste.

    Det skal være muligt for Alfonso, at trykke på en knap, der gør at han kan oprette en ordre, hvor han selv kan vælge
    hvilke pizzaer, der skal indgå i ordren og antal pizzaer. Når ordren er færdig, opdateres odreliste
    For hver gang Alfonso tilføjer en pizza opdateres ordrelisten,
    med den nye pizza, der er blevet tilføjet.

     Når han er færdig med at tilføje, skal det være muligt at afslutte programmet, ved at trykke på en bestemt knap fx.2
     herefter skal den samlede pris vises samt hvad tid den skal hentes.
     Til sidst vises beskeden "Ordre vidersendt", som skal indikere at ordren er sendt til Mario,
     så han ved hvilke pizzer der skal laves */

public class OrdreApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pizza menu[] = Menukort.createMenu();

        ArrayList<Ordre> ordreListe = new ArrayList<>();

        boolean UserExit = false;

        while(UserExit == false){

            switch (sc.nextInt()){
                case 1: //Ny pizza
                    ordreListe.add(Ordre.createOrdre(menu));
                    break;

                case 2: //Vis ordre
                    Ordre.showOrdre(ordreListe);
                    break;

                case 3: //Exit
                    UserExit = true;
                    break;

            }

        }
    }
}

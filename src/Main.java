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

public class Main {

    static Pizza menu[] = Menukort.createMenu();        //Opretter pizza menukort med alle pizza-elementer i memory

    public static void main(String[] args) {

        ArrayList<Ordre> ordreListe = new ArrayList<>();//Opretter ordreliste for pizzabestillinger

        Scanner sc = new Scanner(System.in);            //Scanner for userinput i switch case

        System.out.println("Gruppe-5 Software inc. (Copyright © 1982)");
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║       Mario's Pizzaria v1.0       ║");
        System.out.println("╚═══════════════════════════════════╝");

        boolean UserExit = false;

        while(UserExit == false){

            choice();                                   //Printer hovedmenu oversigt

            switch (sc.nextInt()){

                case 1: //Opret ordre
                    Menukort.menuForUser();
                    ordreListe.add(Ordre.createOrdre(Main.menu));
                    break;

                case 2: //Vis ordre
                    Ordre.showOrdre(ordreListe);
                    break;

                case 3: //Vis statistik
                    Statistik.showStatistic();
                    break;

                case 4: //Slet ordre
                    Ordre.showOrdre(ordreListe);
                    Ordre.sletOrdre(ordreListe);
                    break;

                case 5: //Exit
                    UserExit = true;
                    break;

                default:
                    System.out.println("Input ikke godkendt prøv igen");
                    break;
            }
        }
    }

    public static void choice (){
        System.out.println("┌─────────────Hovedmenu─────────────┐");
        System.out.println("│»Tryk 1 for at starte bestilling   │");
        System.out.println("│»Tryk 2 for at vise aktive ordre   │");
        System.out.println("│»Tryk 3 for at vise salgsstatistik │");
        System.out.println("│»Tryk 4 for at slette ordre        │");
        System.out.println("│»Tryk 5 for at slukke systemet     │");
        System.out.println("└───────────────────────────────────┘");
    }
}


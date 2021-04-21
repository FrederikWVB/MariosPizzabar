import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

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


        boolean UserExit = false;

        while(UserExit == false){

            choice();                                   //Printer hovedmenu oversigt

            switch (sc.nextInt()){

                case 1: //Opret ordre
                    System.out.println(Menukort.menuForUser(menu));
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
                    System.out.println("Indtast ID på den ordre du vil fjerne");
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
        System.out.println("tryk 1 for at starte bestilling");
        System.out.println("tryk 2 for at vise nuværende ordre");
        System.out.println("tryk 3 for at vise salgsstatistik");
        System.out.println("tryk 4 for at slette ordre");
        System.out.println("tryk 5 for at slukke systemet");
    }
}


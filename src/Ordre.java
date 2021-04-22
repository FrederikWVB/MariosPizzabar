import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ordre {
    String kundenavn;
    String bestillingstidspunkt;
    static int idCounter = 1;                   //Static idCounter. Inkrementeres +1 hver gang Ordre element skabes
    int bestillingsID;
    int samletPris;
    ArrayList<Pizza> pizzaOrdre = new ArrayList<>();

    public Ordre() {
        this.bestillingsID = idCounter++;       //Hver gang nyt Ordre element skabes, tilægges nyt ID, der derefter inkrementeres +1
    }

    public void setKundenavn(String kundenavn) {
        this.kundenavn = kundenavn;
    }


    public static Ordre createOrdre(Pizza menu[]) {
        Ordre currentOrder = new Ordre();           //Laver et nyt Ordre element
        Scanner sc = new Scanner(System.in);
        System.out.println("»Indtast kundenavn:");
        currentOrder.setKundenavn(sc.nextLine());   //Sætter kundenavn = input

        int choice = 1;
        int counter = 0;

        System.out.println("Tast 0 for at afslutte bestilling");

        while (choice != 0) {                        //Mens choice != 0, tilføj flere pizzaer
            System.out.print("»Pizza ID: ");
            choice = sc.nextInt();
            if (choice != 0) {
                currentOrder.pizzaOrdre.add(menu[choice]);  //Tilføj pizza til ordreliste, tilsvarende menukort ID
                Main.menu[choice].salg++;                   //Inkrementer salgscounter til givne pizza (bruges i statistik)
                currentOrder.samletPris = currentOrder.samletPris + currentOrder.pizzaOrdre.get(counter).pris; //Samlet pris for bestilling
                System.out.println(menu[choice].getNavn() + " Tilføjet"); //Printer navn for bestilt pizza
                counter++;                                  //counter for at holde styr på # bestilt pizza i den givne ordre
            }
        }
        currentOrder.bestillingstidspunkt = time();         //Tilføj tid for bestilling i (Time:Minut:Sekund)

        return currentOrder;
    }

    public static void showOrdre(ArrayList<Ordre> ordreListInput) {
        System.out.println("┌─────Aktive Ordre─────┐");

        for (int i = 0; i < ordreListInput.size(); i++) {        //Loop gennemgår alle bestillinger i ordreList
            System.out.println("│Kunde: " + ordreListInput.get(i).kundenavn);
            System.out.println("│Tid  : " + ordreListInput.get(i).bestillingstidspunkt);

            for (int j = 0; j < (ordreListInput.get(i).pizzaOrdre.size()); j++) {   //Loop printer alle bestilte pizzaer i given ordre
                System.out.print("│" + ordreListInput.get(i).pizzaOrdre.get(j).getID() + " ");
                System.out.print(ordreListInput.get(i).pizzaOrdre.get(j).getNavn() + " ");
                System.out.println(ordreListInput.get(i).pizzaOrdre.get(j).getPris() + "kr");
            }

            System.out.println("│Samlet pris   : " + ordreListInput.get(i).samletPris + "kr");
            System.out.println("│Bestillings ID: " + ordreListInput.get(i).bestillingsID);
            System.out.println("├──────────────────────┤");


        }
    }

    public static void sletOrdre(ArrayList<Ordre> ordreListInput) {
        System.out.println("»Indtast bestillings ID på den ordre du vil slette");
        Scanner sc = new Scanner(System.in);
        int checkID = sc.nextInt();                                 //Tager input for ID for element der skal slettes
        for (int i = 0; i < ordreListInput.size(); i++) {
            if (ordreListInput.get(i).bestillingsID == checkID) {   //Checker om givent ID passer overens med ID i listen
                ordreListInput.remove(i);                           //Sletter Arrayliste element hvis ID == input
                System.out.println("Bestilling med ID \"" + checkID + "\" Slettet");
            }
        }
    }

    public static String time() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("HH:mm:ss"); //dd-MM-yyyy
        return date.format(formatDate);
    }
}

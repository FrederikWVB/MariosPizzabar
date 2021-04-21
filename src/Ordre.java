import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ordre {
    String kundenavn;
    String bestillingstidspunkt;
    static int idCounter = 1;
    int bestillingsID;
    int samletPris;
    ArrayList<Pizza> pizzaOrdre = new ArrayList<>();

    public Ordre(){
        this.bestillingsID = idCounter++;
    }

    public void setKundenavn(String kundenavn) {
        this.kundenavn = kundenavn;
    }
    public static int getBestillingsID (int bestillingsID){
        return bestillingsID;
    }


    public static void main(String[] args) {

        Pizza menu[] = Menukort.createMenu();
        ArrayList<Ordre> ordreListe = new ArrayList<>();

        ordreListe.add(createOrdre(menu));
        ordreListe.add(createOrdre(menu));
        showOrdre(ordreListe);
    }

    public static Ordre createOrdre (Pizza menu[]){
        Ordre currentOrder = new Ordre();
        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast kundenavn:");
        currentOrder.setKundenavn(sc.nextLine());

        int choice = 1;
        int counter = 0;

        System.out.println("Tast 0 når alle pizzer er på bestillingsliste");
        while (choice != 0){
            System.out.print("Pizza ID: ");
            choice = sc.nextInt();
            if (choice != 0){
                currentOrder.pizzaOrdre.add(menu[choice]);
                Main.menu[choice].salg++;
                currentOrder.samletPris = currentOrder.samletPris + currentOrder.pizzaOrdre.get(counter).pris;
                System.out.println(menu[choice].getNavn());
                counter++;
            }
        }
        currentOrder.bestillingstidspunkt = time();

        return currentOrder;
    }

    public static void showOrdre (ArrayList<Ordre> ordreListInput){
        for (int i = 0; i < ordreListInput.size(); i++){

            System.out.println("Kunde: " + ordreListInput.get(i).kundenavn);
            System.out.println("Tid: " + ordreListInput.get(i).bestillingstidspunkt);

            for (int j = 0; j < (ordreListInput.get(i).pizzaOrdre.size()) ; j++){
                System.out.print(ordreListInput.get(i).pizzaOrdre.get(j).getID() + " ");
                System.out.print(ordreListInput.get(i).pizzaOrdre.get(j).getNavn() + " ");
                System.out.println(ordreListInput.get(i).pizzaOrdre.get(j).getPris() + "kr");
            }

            System.out.println("Samlet pris: " + ordreListInput.get(i).samletPris);
            System.out.println("ID: " + ordreListInput.get(i).bestillingsID);
        }
    }

    public static void sletOrdre (ArrayList<Ordre> ordreListInput){
        Scanner sc = new Scanner(System.in);
        int checkID = sc.nextInt();
        for (int i = 0; i < ordreListInput.size(); i++){
            if (ordreListInput.get(i).bestillingsID == checkID){
                ordreListInput.remove(i);
            }
        }
    }


    public static String time() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("HH:mm:ss"); //dd-MM-yyyy
        return date.format(formatDate);
    }
}

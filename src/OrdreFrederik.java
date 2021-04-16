import java.util.ArrayList;
import java.util.Scanner;

public class OrdreFrederik {
    String kundenavn;
    String bestillingstidspunkt;
    static int idCounter = 1;
    int bestillingsID;
    int samletPris;
    ArrayList<Pizza> pizzaOrdre = new ArrayList<>();

    public OrdreFrederik(){
        this.bestillingsID = idCounter++;
    }

    public void setKundenavn(String kundenavn) {
        this.kundenavn = kundenavn;
    }


    public static void main(String[] args) {

        Pizza menu[] = Menukort.createMenu();

        ArrayList<OrdreFrederik> ordreListe = new ArrayList<>();

        ordreListe.add(createOrdre(menu));
        //ordreListe.add(createOrdre(menu));
        //ordreListe.add(createOrdre(menu));

        showOrdre(ordreListe);

    }

    public static OrdreFrederik createOrdre (Pizza menu[]){
        OrdreFrederik currentOrder = new OrdreFrederik();
        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast kundenavn:");
        currentOrder.setKundenavn(sc.nextLine());

        int choice = 1;
        int counter = 0;

        System.out.println("Tast 0 for Exit");
        while (choice != 0){
            System.out.print("Pizza ID: ");
            choice = sc.nextInt();
            if (choice != 0){
                currentOrder.pizzaOrdre.add(menu[choice]);
                currentOrder.samletPris = currentOrder.samletPris + currentOrder.pizzaOrdre.get(counter).pris;
                System.out.println(menu[choice].getNavn());
                counter++;
            }
        }

        currentOrder.bestillingstidspunkt = Ordre.time();

        return currentOrder;
    }

    public static void showOrdre (ArrayList<OrdreFrederik> ordreListInput){
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

}

import java.util.ArrayList;
import java.util.Scanner;

public class OrdreFrederik {
    String kundenavn;
    String bestillingstidspunkt;
    int bestillingsID;
    int samletPris;
    ArrayList<Pizza> pizzaOrdre = new ArrayList<Pizza>();

    static int idCounter = 0;

    public OrdreFrederik(){
        idCounter++;
    }

    public void setKundenavn(String kundenavn) {
        this.kundenavn = kundenavn;
    }

    public static int getIdCounter (){
        return idCounter;
    }


    public static void main(String[] args) {

        Pizza menu[] = Menukort.createMenu();

        ArrayList<OrdreFrederik> ordreListe = new ArrayList<>();

        ordreListe.add(createOrdre(menu));

        for (int i = 0; i < (ordreListe.get(0).pizzaOrdre.size()) ; i++){
            System.out.print(ordreListe.get(0).pizzaOrdre.get(i).getID() + " ");
            System.out.print(ordreListe.get(0).pizzaOrdre.get(i).getNavn() + " ");
            System.out.println(ordreListe.get(0).pizzaOrdre.get(i).getPris() + "kr");
        }

        System.out.println("Kunde: " + ordreListe.get(0).kundenavn);
        System.out.println("Tid: " + ordreListe.get(0).bestillingstidspunkt);
        System.out.println("Samlet pris: " + ordreListe.get(0).samletPris);
        System.out.println(ordreListe.get(0).bestillingsID);

        ordreListe.add(createOrdre(menu));
        System.out.println(ordreListe.get(0).bestillingsID);

    }

    public static OrdreFrederik createOrdre (Pizza menu[]){
        OrdreFrederik currentOrder = new OrdreFrederik();
        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast kundenavn");
        currentOrder.setKundenavn(sc.nextLine());

        int choice = 1;
        int counter = 0;

        while (choice != 0){
            choice = sc.nextInt();
            if (choice != 0){
                currentOrder.pizzaOrdre.add(menu[choice]);
                currentOrder.samletPris = currentOrder.samletPris + currentOrder.pizzaOrdre.get(counter).pris;
                System.out.println(menu[choice].getNavn());
                counter++;
            }
        }


        currentOrder.bestillingstidspunkt = Ordre.time();
        currentOrder.bestillingsID = OrdreFrederik.getIdCounter();

        return currentOrder;
    }

    }

import java.util.ArrayList;
import java.util.Scanner;

public class OrdreFrederik {
    String kundenavn;
    ArrayList<Pizza> pizzaOrdre = new ArrayList<Pizza>();

    public OrdreFrederik(){}

    public void setKundenavn(String kundenavn) {
        this.kundenavn = kundenavn;
    }

    public void setPizzaOrdre(ArrayList<Pizza> pizzaOrdre) {
        this.pizzaOrdre = pizzaOrdre;
    }

    public static void main(String[] args) {

        Pizza menu[] = Menukort.createMenu();

        ArrayList<OrdreFrederik> ordreListe = new ArrayList<>();

        ordreListe.add(createOrdre(menu));

        for (int i = 0; i < (ordreListe.get(0).pizzaOrdre.size()) ; i++){
            System.out.println(ordreListe.get(0).pizzaOrdre.get(i).getNavn());
        }

        System.out.println("Kunde: " + ordreListe.get(0).kundenavn);

    }

    public static OrdreFrederik createOrdre (Pizza menu[]){
        OrdreFrederik currentOrder = new OrdreFrederik();
        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast kundenavn");
        currentOrder.setKundenavn(sc.nextLine());

        int choice = 1;

        while (choice != 0){
            choice = sc.nextInt();
            if (choice != 0){
                currentOrder.pizzaOrdre.add(menu[choice]);
                System.out.println(menu[choice].getNavn());
            }
        }

        return currentOrder;
    }

    }

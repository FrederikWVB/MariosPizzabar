import java.util.ArrayList;
import java.util.Scanner;

public class OrdreFrederik {
    String kundenavn;
    ArrayList<Pizza> pizzaOrdre = new ArrayList<Pizza>();

    public OrdreFrederik() {}

    public void setKundenavn(String kundenavn) {
        this.kundenavn = kundenavn;
    }

    public void setPizzaOrdre(ArrayList<Pizza> pizzaOrdre) {
        this.pizzaOrdre = pizzaOrdre;
    }


    public static void main(String[] args) {
        //ArrayList<Pizza> pizzas = new ArrayList<>();

        Pizza menu[] = Menukort.createMenu();

        //System.out.println(menu[0].getNavn());



        //System.out.println(pizzas.get(0).getNavn());

        System.out.println(createOrdre(menu).pizzaOrdre.get(0).getNavn());

    }

    public static OrdreFrederik createOrdre (Pizza menu[]){
        OrdreFrederik kunde = new OrdreFrederik();
        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast kundenavn");
        kunde.setKundenavn(sc.nextLine());

        kunde.pizzaOrdre.add(menu[0]);
        kunde.pizzaOrdre.add(menu[0]);

        return kunde;
    }

    }

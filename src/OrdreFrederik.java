import java.util.ArrayList;

public class OrdreFrederik {



    public static void main(String[] args) {
        ArrayList<Pizza> pizzas = new ArrayList<>();

        Pizza menu[] = Menukort.createMenu();

        //System.out.println(menu[0].getNavn());

        pizzas.add(menu[0]);

        System.out.println(pizzas.get(0).getNavn());

    }

    }

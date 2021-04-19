import java.util.ArrayList;

public class Menukort {

    public static Pizza[] createMenu(){
        Pizza[] menu = new Pizza[20];

        menu[0] = (new Pizza("Vesuvio", 57, 1));
        menu[1] = (new Pizza("Amerikaner", 53, 2));
        menu[2] = (new Pizza("Cacciatore", 57, 3));
        menu[3] = (new Pizza("Carbonara", 63, 4));
        menu[4] = (new Pizza("Dennis", 65, 5));

        return menu;

        ArrayList<Pizza> pizzakort = new ArrayList<>();
    }






}

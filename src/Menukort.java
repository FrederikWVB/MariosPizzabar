import java.util.ArrayList;

public class Menukort {

    public static Pizza[] createMenu() {
        Pizza[] menu = new Pizza[6];

        menu[0] = (new Pizza("x",1,999999999,0));
        menu[1] = (new Pizza("Vesuvio", 57, 1,0));
        menu[2] = (new Pizza("Amerikaner", 53, 2,0));
        menu[3] = (new Pizza("Cacciatore", 57, 3,0));
        menu[4] = (new Pizza("Carbonara", 63, 4,0));
        menu[5] = (new Pizza("Dennis", 65, 5,0));
        return menu;
    }


    public static String menuAgain(Pizza[] menu) {
        return menu[0].ID + " " + menu[0].navn;

    }

}

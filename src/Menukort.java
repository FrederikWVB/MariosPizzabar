public class Menukort {

    public static Pizza[] createMenu() {
        Pizza[] menu = new Pizza[11];

        menu[0] = (new Pizza("x",0,99,0));
        menu[1] = (new Pizza("Vesuvio", 57, 1,0));
        menu[2] = (new Pizza("Capricciosa", 53, 2,0));
        menu[3] = (new Pizza("Americana", 57, 3,0));
        menu[4] = (new Pizza("Siciliana", 63, 4,0));
        menu[5] = (new Pizza("Pollo", 69, 5,0));
        menu[6] = (new Pizza("Vecchia", 63, 6,0));
        menu[7] = (new Pizza("Bianca", 59, 7,0));
        menu[8] = (new Pizza("Ventura", 69, 8,0));
        menu[9] = (new Pizza("Pancetta", 71, 9,0));
        menu[10] = (new Pizza("Calzone", 65, 10,0));

        return menu;
    }


    public static void menuForUser() {
        System.out.println("┌────────Menukort────────┐");
        for (int i = 1; i < Main.menu.length; i++){
            System.out.print("│" + Main.menu[i].getID() + " ");
            System.out.print(Main.menu[i].getNavn() + " - ");
            System.out.println(Main.menu[i].getPris()+ "kr");
        }
        System.out.println("└────────────────────────┘");
    }
}

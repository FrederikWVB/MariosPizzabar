public class Menukort {

    public static Pizza[] createMenu() {
        Pizza[] menu = new Pizza[6];

        menu[0] = (new Pizza("x",0,99,0));
        menu[1] = (new Pizza("Vesuvio", 57, 1,0));
        menu[2] = (new Pizza("Amerikaner", 53, 2,0));
        menu[3] = (new Pizza("Cacciatore", 57, 3,0));
        menu[4] = (new Pizza("Carbonara", 63, 4,0));
        menu[5] = (new Pizza("Dennis", 65, 5,0));
        return menu;
    }


    public static void menuForUser() {
        System.out.println("┌───────Menukort───────┐");
        for (int i = 1; i < Main.menu.length; i++){
            System.out.print("│" + Main.menu[i].getID() + " ");
            System.out.print(Main.menu[i].getNavn() + " ");
            System.out.println(Main.menu[i].getPris()+ "kr");
        }
        System.out.println("└──────────────────────┘");
    }

}

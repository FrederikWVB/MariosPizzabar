public class Statistik {

    public static void showStatistic (){
        System.out.println("┌─────────────Statistik─────────────┐");
        int totalomsætning = 0;
        for (int i = 1; i < Main.menu.length; i++){
            System.out.print("│" + Main.menu[i].getID() + " ");
            System.out.print(Main.menu[i].getNavn() + " - Antal salg: ");
            System.out.println(Main.menu[i].getSalg() + "x");
            totalomsætning = totalomsætning + (Main.menu[i].getSalg() * Main.menu[i].getPris());//pizzasalg * pizzapris
        }
        System.out.println("│Totalomsætning: " + totalomsætning + "kr");
        System.out.println("└───────────────────────────────────┘");
    }
}
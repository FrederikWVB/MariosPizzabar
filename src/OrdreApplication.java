import java.util.ArrayList;
import java.util.Scanner;

public class OrdreApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pizza menu[] = Menukort.createMenu();

        ArrayList<OrdreFrederik> ordreListe = new ArrayList<>();

        boolean UserExit = false;

        while(UserExit == false){



            switch (sc.nextInt()){
                case 1: //Ny pizza
                    ordreListe.add(OrdreFrederik.createOrdre(menu));
                    break;

                case 2: //Vis ordre
                    OrdreFrederik.showOrdre(ordreListe);
                    break;

                case 3: //Exit
                    UserExit = true;
                    break;

            }

        }
    }
}

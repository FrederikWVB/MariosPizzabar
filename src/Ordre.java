import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Ordre {

    public static void main(String[] args) {
        ArrayList<Pizza> pizzas = new ArrayList<>();

        Pizza menu[] = Menukort.createMenu();

        //System.out.println(menu[0].getNavn());

        pizzas.add(menu[0]);

        System.out.println(pizzas.get(0).getNavn());




        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String finalDate = date.format(formatDate);
        System.out.println(finalDate);
    }


}

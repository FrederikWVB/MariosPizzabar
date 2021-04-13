import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Ordre {

    public static void main(String[] args) {
        ArrayList<Pizza> Pizza = new ArrayList<>();

        //Pizza pizza1 = new Pizza("John", "Peperoni", 10, 1);

        //Pizza.add(pizza1);

        Pizza menu[] = Menukort.createMenu();

        System.out.println(menu[0]);




        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String finalDate = date.format(formatDate);
        System.out.println(finalDate);
    }


}

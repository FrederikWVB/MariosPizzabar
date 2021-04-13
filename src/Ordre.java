import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Ordre {

    ArrayList<Pizza> Pizzas = new ArrayList();



    public void time () {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String finalDate = date.format(formatDate);
        System.out.println(finalDate);
    }
}

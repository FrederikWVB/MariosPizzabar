import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Kunde {
    String navn;
    int tlfNr;

    public Kunde(String navn, int tlfNr) {
        this.navn = navn;
        this.tlfNr = tlfNr;
    }

}
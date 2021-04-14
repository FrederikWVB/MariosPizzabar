import java.util.ArrayList;

public class Pizza {
    String navn;

    int pris;
    int ID;

    public Pizza (){};

    public Pizza(String navn, int pris, int ID) {
        this.navn = navn;
        this.pris = pris;
        this.ID = ID;
    }

    public String getNavn() {
        return navn;
    }



    public int getPris() {
        return pris;
    }

    public int getID() {
        return ID;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }


    public void setPris(int pris) {
        this.pris = pris;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

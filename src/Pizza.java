public class Pizza {
    String navn;
    int pris;
    int ID;
    int salg;

    public Pizza (){};

    public Pizza(String navn, int pris, int ID, int salg) {
        this.navn = navn;
        this.pris = pris;
        this.ID = ID;
        this.salg = salg;

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

    public int getSalg(){
        return salg;
    }

}

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

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int setSalg(){
        return salg;
    }
}

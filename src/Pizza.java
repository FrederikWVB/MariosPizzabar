public class Pizza {
    String navn;
    String pizzaindhold;
    int pris;
    int ID;

    public Pizza(String navn, String pizzaindhold, int pris, int ID) {
        this.navn = navn;
        this.pizzaindhold = pizzaindhold;
        this.pris = pris;
        this.ID = ID;
    }

    public String getNavn() {
        return navn;
    }

    public String getPizzaindhold() {
        return pizzaindhold;
    }

    public int getPris() {
        return pris;
    }

    public int getID() {
        return ID;
    }
}

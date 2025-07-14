package gaetanomiscio.U5_W1_D1.entites;

public abstract class Menu {
    protected int calorie;
    protected double prezzo;

    public Menu(int calorie, double prezzo) {
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}

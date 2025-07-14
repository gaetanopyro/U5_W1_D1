package gaetanomiscio.U5_W1_D1.entites;

public class Pizzas extends Menu {
    private String tomato;
    private String cheese;

    public Pizzas(int calorie, double prezzo, String tomato, String cheese) {
        super(calorie, prezzo);
        this.tomato = tomato;
        this.cheese = cheese;
    }


}

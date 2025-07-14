package gaetanomiscio.U5_W1_D1.entites;

public class Topping extends Menu {
    private String cheese;
    private String ham;
    private String onions;
    private String pineapple;
    private String salami;


    public Topping(int calorie, double prezzo, String cheese, String ham, String onions, String pineapple, String salami) {
        super(calorie, prezzo);
        this.cheese = cheese;
        this.ham = ham;
        this.onions = onions;
        this.pineapple = pineapple;
        this.salami = salami;
    }

}

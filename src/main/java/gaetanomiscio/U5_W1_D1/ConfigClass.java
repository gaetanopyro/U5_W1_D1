package gaetanomiscio.U5_W1_D1;

import gaetanomiscio.U5_W1_D1.entites.Drink;
import gaetanomiscio.U5_W1_D1.entites.Menu;
import gaetanomiscio.U5_W1_D1.entites.Pizza;
import gaetanomiscio.U5_W1_D1.entites.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {

    @Bean
    public Pizza getPizza1() {
        return new Pizza("Margherita", "tomato and cheese", 1104, 4.99);
    }

    @Bean
    public Pizza getPizza2() {
        return new Pizza("Hawaiana", "tomato,cheese,ham,pineapple", 1024, 6.490);

    }

    @Bean
    public Pizza getPizza3() {
        return new Pizza("Diavola", "tomato,cheese,ventricina", 1160, 5.99);
    }

    @Bean
    public List<Pizza> getAllPizzas() {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(getPizza1());
        pizzas.add(getPizza2());
        pizzas.add(getPizza3());
        return pizzas;
    }

    @Bean
    public Topping getTopping1() {
        return new Topping("cheese", 92, 0.69);
    }

    @Bean
    public Topping getTopping2() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean
    public Topping getTopping3() {
        return new Topping("Onions", 22, 0.69);
    }

    @Bean
    public Topping getTopping4() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean
    public Topping getTopping5() {
        return new Topping("Ventricina", 86, 0.99);
    }

    @Bean
    public List<Topping> getAllToppings() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getTopping1());
        toppings.add(getTopping2());
        toppings.add(getTopping3());
        toppings.add(getTopping4());
        toppings.add(getTopping5());
        return toppings;
    }

    @Bean
    public Drink getWater1() {
        return new Drink("Lemonade (0.33l)", 128, 1.29);
    }


    @Bean
    public Drink getWater2() {
        return new Drink("Water (0.5l)", 0, 1.29);
    }

    @Bean
    public Drink getWater3() {
        return new Drink("Wine (0.75l,13%)", 607, 7.49);
    }

    @Bean
    public List<Drink> getAllDrinks() {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(getWater1());
        drinks.add(getWater2());
        drinks.add(getWater3());
        return drinks;
    }

    @Bean
    public Menu getMenu() {
        return new Menu(getAllPizzas(), getAllToppings(), getAllDrinks());
    }

}





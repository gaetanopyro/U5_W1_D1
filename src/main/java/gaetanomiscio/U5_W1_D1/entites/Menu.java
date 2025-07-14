package gaetanomiscio.U5_W1_D1.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    @Override
    public String toString() {
        System.out.println("Menu");
        System.out.println("Pizzas");
        pizzas.forEach(System.out::println);
        System.out.println("Toppings");
        toppings.forEach(System.out::println);
        System.out.println("Drinks");
        drinks.forEach(System.out::println);
        return "";
    }
}

package gaetanomiscio.U5_W1_D1.entites;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pizza extends Element {
    private List<Topping> toppings;

    public Pizza(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}

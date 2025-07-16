package gaetanomiscio.U5_W1_D1.entites;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends Element {
    public Drink(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}





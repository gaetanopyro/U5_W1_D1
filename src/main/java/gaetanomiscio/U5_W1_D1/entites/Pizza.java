package gaetanomiscio.U5_W1_D1.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pizza {
    private String name;
    private String ingredients;
    private int calories;
    private double price;

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}

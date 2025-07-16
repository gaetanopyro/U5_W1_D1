package gaetanomiscio.U5_W1_D1.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Element {
    protected String name;
    protected int calories;
    protected double price;

    @Override
    public String toString() {
        return "Element{" +
                "calories=" + calories +
                ", price=" + price +
                '}';
    }
}

package gaetanomiscio.U5_W1_D1.entites;

import gaetanomiscio.U5_W1_D1.enums.StatusServizio;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private int numOrdine;
    private StatusServizio statusServizio;
    private int numCoperti;
    private double oraAquisizione;
    private List<Element> elements;

    public double getConto(List<Element> elements) {
        return elements.stream()
                .mapToDouble(Element::getPrice)
                .sum();
    }
}

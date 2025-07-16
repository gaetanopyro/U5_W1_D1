package gaetanomiscio.U5_W1_D1.entites;

import gaetanomiscio.U5_W1_D1.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Table {
    private int numTable;
    private int numMaxCoperti;
    private Status status;

    @Override
    public String toString() {
        return "Table{" +
                "numTable=" + numTable +
                ", numMaxCoperti=" + numMaxCoperti +
                ", status=" + status +
                '}';
    }
}

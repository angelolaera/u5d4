package angelolaera.u5d4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="bevande")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Bevanda {

    @Setter(AccessLevel.NONE)
    private long id;
    private String volume;
    private int calorie;
    private double prezzo;

    public Bevanda(String volume, int calorie, double prezzo) {
        this.volume = volume;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

}

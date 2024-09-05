package angelolaera.u5d4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="topping")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Topping {

    @Setter(AccessLevel.NONE)
    private long id;
    private String nome;
    private int calorie;
    private double prezzo;

    public Topping(String nome, int calorie, double prezzo) {
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }
}

package angelolaera.u5d4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Table(name="topping")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Pizza {

    @Setter(AccessLevel.NONE)
    private long id;
    private String nome;
    private List<String> ingredientiBase;
    private List<Topping> toppings;
    private int calorie;
    private double prezzo;

    public Pizza(String nome, List<String> ingredientiBase, List<Topping> toppings, int calorie, double prezzo) {
        this.nome = nome;
        this.ingredientiBase = ingredientiBase;
        this.toppings = toppings;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }
}

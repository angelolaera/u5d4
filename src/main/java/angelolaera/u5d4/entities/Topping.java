package angelolaera.u5d4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="topping")
@Getter
@Setter
@ToString
@NoArgsConstructor



public class Topping {



    @Setter(AccessLevel.NONE)
    @Id
    private long id;
    private String nome;
    private int calorie;
    private double prezzo;

    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;

    public Topping(long id, String nome, int calorie, double prezzo) {
        this.id = id;
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;

    }
}

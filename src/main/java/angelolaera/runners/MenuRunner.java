package angelolaera.runners;


import angelolaera.u5d.service.BevandaService;
import angelolaera.u5d.service.PizzaService;
import angelolaera.u5d.service.ToppingService;
import angelolaera.u5d4.entities.Bevanda;
import angelolaera.u5d4.entities.Pizza;
import angelolaera.u5d4.entities.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class MenuRunner implements CommandLineRunner {

    @Autowired
    private ToppingService toppingService;
    private BevandaService bevandaService;
    private PizzaService pizzaService;

    @Override
    public void run (String... args) {

        Bevanda bevanda = new Bevanda(1,"Acqua","50cl",0,1.50);
        bevandaService.saveBevanda(bevanda);

        Topping salami = new Topping(1,"Salami",600,0.5);
        toppingService.saveTopping(salami);

        Pizza pizza_salami = new Pizza(1,"Pizza Salami", List.of("Mozzarella","Pomodoro"),List.of(salami),800,6.5);
        pizzaService.savePizza(pizza_salami);

    }

}

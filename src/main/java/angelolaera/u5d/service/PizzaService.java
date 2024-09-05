package angelolaera.u5d.service;

import angelolaera.u5d4.entities.Bevanda;

import angelolaera.u5d4.entities.Pizza;
import angelolaera.u5d4.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> getAllToppings() {
        return pizzaRepository.findAll();
    }

    public Pizza savePizza (Pizza pizza){
        return pizzaRepository.save(pizza);
    }

}
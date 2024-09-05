package angelolaera.u5d.service;

import angelolaera.u5d4.entities.Topping;
import angelolaera.u5d4.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ToppingService {

    @Autowired
    private ToppingRepository toppingRepository;

    public List<Topping> getAllToppings() {
        return toppingRepository.findAll();
    }

    public Topping saveTopping (Topping topping){
        return toppingRepository.save(topping);
    }

}

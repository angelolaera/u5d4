package angelolaera.u5d.service;

import angelolaera.u5d4.entities.Bevanda;
import angelolaera.u5d4.repositories.BevandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BevandaService {

    @Autowired
    private BevandaRepository bevandaRepository;

    public List<Bevanda> getAllToppings() {
        return bevandaRepository.findAll();
    }

    public Bevanda saveBevanda (Bevanda bevanda){
        return bevandaRepository.save(bevanda);
    }

}
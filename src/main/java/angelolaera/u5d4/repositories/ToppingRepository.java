package angelolaera.u5d4.repositories;

import angelolaera.u5d4.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ToppingRepository extends JpaRepository<Topping,Long> {

}

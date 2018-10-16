package globant.topic6.repositories;

import globant.topic6.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Emiliano
 */
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {

}

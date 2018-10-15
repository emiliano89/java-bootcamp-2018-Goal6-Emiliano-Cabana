package globant.topic6.repositories;

import globant.topic6.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Emiliano
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}

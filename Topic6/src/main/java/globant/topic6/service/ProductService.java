package globant.topic6.service;

/* 
import globant.topic6.model.Product;
import globant.topic6.dao.ProductRepository;
import java.util.List;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
*/
/**
 *
 * @author Emiliano
 */
//@RestController
public class ProductService {
/*    
    private final ProductRepository repository;

    ProductService(ProductRepository repository) {
	this.repository = repository;
    }

    
    @GetMapping("/products")
	List<Product> all() {
		return repository.findAll();
	}
        
    @PostMapping("/products")
	Product newProduct(@RequestBody Product newProduct) {
		return repository.save(newProduct);
	}
        
    @GetMapping("/products/{id}")
	Product one(@PathVariable Long id) throws Throwable {
            return repository.findById(id)
                        .orElseThrow(() -> {
                return new NotFoundException("Product not found");
            });
	}
    
    @PutMapping("/products/{id}")
	Product replaceProduct(@RequestBody Product newProduct, @PathVariable Long id) {

		return repository.findById(id)
			.map(product -> {
				product.setProduct_name(newProduct.getProduct_name());
				product.setPrice(newProduct.getPrice());
                                product.setQuantity(newProduct.getQuantity());
				return repository.save(product);
			})
			.orElseGet(() -> {
				newProduct.setProduct_id(id);
				return repository.save(newProduct);
			});
	}
    
    @DeleteMapping("/products/{id}")
	void deleteProduct(@PathVariable Long id) {
		repository.deleteById(id);
	}
*/ 
}

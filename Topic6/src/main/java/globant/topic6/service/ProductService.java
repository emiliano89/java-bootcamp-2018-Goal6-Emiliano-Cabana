package globant.topic6.service;

import globant.topic6.model.Product;
import globant.topic6.repositories.ProductRepository;
import java.util.List;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Emiliano
 */
@Service
@AllArgsConstructor
public class ProductService {
   @Autowired
   private ProductRepository productRepository;

   public List<Product> getProducts () {
       return productRepository.findAll();
   }
   
   public Product addProduct (Product product) {
       return productRepository.save(product);
   }
   
   public Product getOneProduct(int id) {
      return productRepository.getOne(id);
   }
   
   public void deleteProductById(int id) {
      productRepository.deleteById(id);
   }
   
   public Product replaceProduct(Product newProduct, int id) {
		return productRepository.findById(id)
			.map(product -> {
				product.setProduct_name(newProduct.getProduct_name());
				product.setPrice(newProduct.getPrice());
                                product.setQuantity(newProduct.getQuantity());
				return productRepository.save(product);
			})
			.orElseGet(() -> {
				return productRepository.save(newProduct);
			});
	}
}

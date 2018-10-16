package globant.topic6.service;

import globant.topic6.model.Product;
import globant.topic6.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
   
   public Optional<Product> getOneProduct(int id) {
       return productRepository.findById(id);
   }
   
   public void deleteProductById(int id) {
      productRepository.deleteById(id);
   }


   public Product replaceProduct(String product_name, double price, int quantity, int id) {
        Product newProduct = new Product(product_name, price, quantity);
		return productRepository.findById(id)
			.map(product -> {
				product.setProduct_name(newProduct.getProduct_name());
				product.setPrice(newProduct.getPrice());
				product.setQuantity(newProduct.getQuantity());
				return productRepository.save(product);
			})
			.orElseGet(() -> productRepository.save(newProduct));
	}
}

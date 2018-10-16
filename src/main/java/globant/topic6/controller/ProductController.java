package globant.topic6.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import globant.topic6.model.Product;
import globant.topic6.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Emiliano
 */
@RestController
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductController {
    
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
	this.productService = productService;
    }

    
    @GetMapping(path = "/products")
    public List<Product> getAll() {
		return productService.getProducts();
	}
        
    @PostMapping(path = "/products/addProduct")
    public Product addProduct(@RequestParam(name = "product_name") String product_name,
                              @RequestParam(name = "price") double price,
                              @RequestParam(name = "quantity") int quantity) {
        Product product = new Product(product_name, price, quantity);
		return productService.addProduct(product);
	}
    
        
    @GetMapping(path = "/products/{id}")
    public Optional<Product> getOneProduct(@PathVariable(value = "id") int id ) {
            return productService.getOneProduct(id);
	}

    @DeleteMapping(path = "/products/{id}")
    public void deleteProductById(@PathVariable(value = "id") int id) {
	   productService.deleteProductById(id);
	}
    
    @PutMapping("/products/{id}")
    public Product replaceProduct(@RequestParam(name = "product_name") String product_name,
                                  @RequestParam(name = "price") double price,
                                  @RequestParam(name = "quantity") int quantity, @PathVariable(value = "id") int id) {
          return productService.replaceProduct(product_name,price,quantity, id);
    }
}

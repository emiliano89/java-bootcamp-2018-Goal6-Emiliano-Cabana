package globant.topic6.controller;

import globant.topic6.model.Product;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import globant.topic6.service.ProductService;
/**
 *
 * @author Emiliano
 */
@RestController
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
    
        
    @GetMapping(path = "/products/getOneProduct")
    public Product getOneProduct(@RequestParam(name = "id") int id ) {
            return productService.getOneProduct(id);
	}
    
    @DeleteMapping(path = "/products/deleteProductById")
    public void deleteProductById(@RequestParam int id) {
	   productService.deleteProductById(id);
	}
    
    @PutMapping("/products/replaceProduct")
    public Product replaceProduct(@RequestBody Product newProduct, @PathVariable int id) {
          return productService.replaceProduct(newProduct, id);
    }
}

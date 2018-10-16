package globant.topic6.controller;

import globant.topic6.model.ShoppingCart;
import globant.topic6.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Emiliano
 */
@RestController
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService) {
	this.shoppingCartService = shoppingCartService;
    }

    @GetMapping(path = "/carts")
    public List<ShoppingCart> getAll() {
		return shoppingCartService.getCarts();
	}
        
    @PostMapping(path = "/carts/addCart")
    public ShoppingCart addShoppingCart(@RequestParam(name = "totalPrice") double totalPrice,
                              @RequestParam(name = "products_quantity") int products_quantity) {
        ShoppingCart cart = new ShoppingCart (totalPrice, products_quantity);
		return shoppingCartService.addShoppingCart(cart);
	}
        
    @GetMapping(path = "/carts/{id}")
    public Optional<ShoppingCart> getOneCart(@PathVariable(name = "id") int id ) {
            return shoppingCartService.getOneCart(id);
	}
    
    @DeleteMapping(path = "/carts/{id}")
    public void deleteCartById(@PathVariable(value = "id") int id) {
	   shoppingCartService.deleteCartById(id);
    }
    
    @PutMapping("/carts/{id}")
    public ShoppingCart replaceCartById(@RequestParam(name = "product_name") double totalPrice,
                                        @RequestParam(name = "price") int products_quantity, @PathVariable(value = "id") int id) {
          return shoppingCartService.replaceCartById(totalPrice,products_quantity, id);
    }
}

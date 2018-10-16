package globant.topic6.controller;

import globant.topic6.model.ShoppingCart;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import globant.topic6.service.ShoppingCartService;
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
        
    @GetMapping(path = "/carts/getOneCart")
    public ShoppingCart getOneCart(@RequestParam(name = "id") int id ) {
            return shoppingCartService.getOneCart(id);
	}
    
    @DeleteMapping(path = "/carts/deleteCartById")
    public void deleteCartById(@RequestParam int id) {
	   shoppingCartService.deleteCartById(id);
    }
    
    @PutMapping("/carts/replaceCartById")
    public ShoppingCart replaceCartById(@RequestBody ShoppingCart newCart, @PathVariable int id) {
          return shoppingCartService.replaceCartById(newCart, id);
    }

}

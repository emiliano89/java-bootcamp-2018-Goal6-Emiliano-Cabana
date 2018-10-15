package globant.topic6.service;

import globant.topic6.model.ShoppingCart;
import globant.topic6.repositories.ShoppingCartRepository;
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
public class ShoppingCartService {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;
    
    public List<ShoppingCart> getCarts() {
       return shoppingCartRepository.findAll();
    }
    
       public ShoppingCart addShoppingCart(ShoppingCart cart) {
       return shoppingCartRepository.save(cart);
    }
   
    public ShoppingCart getOneCart(int id) {
       return shoppingCartRepository.getOne(id);
    }
   
    public void deleteCartById(int id) {
       shoppingCartRepository.deleteById(id);
    }
   
    public ShoppingCart replaceCartById(ShoppingCart newCart, int id) {
       return shoppingCartRepository.findById(id)
			.map(shoppingCart -> {
				shoppingCart.setTotalPrice(newCart.getTotalPrice());
				shoppingCart.setProducts_quantity(newCart.getProducts_quantity());
				return shoppingCartRepository.save(shoppingCart);
			})
			.orElseGet(() -> {
				return shoppingCartRepository.save(newCart);
			});
	}
}

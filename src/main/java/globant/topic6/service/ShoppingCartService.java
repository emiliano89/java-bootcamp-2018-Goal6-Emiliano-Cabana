package globant.topic6.service;

import globant.topic6.model.ShoppingCart;
import globant.topic6.repositories.ShoppingCartRepository;
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
public class ShoppingCartService {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;
    
    public List<ShoppingCart> getCarts() {
       return shoppingCartRepository.findAll();
    }
    
       public ShoppingCart addShoppingCart(ShoppingCart cart) {
       return shoppingCartRepository.save(cart);
    }
   
    public Optional<ShoppingCart> getOneCart(int id) {
       return shoppingCartRepository.findById(id);
    }
   
    public void deleteCartById(int id) {
       shoppingCartRepository.deleteById(id);
    }
   
    public ShoppingCart replaceCartById(double totalPrice, int products_quantity, int id) {
        ShoppingCart newCart = new ShoppingCart(totalPrice,products_quantity);
       return shoppingCartRepository.findById(id)
			.map(shoppingCart -> {
				shoppingCart.setTotalPrice(newCart.getTotalPrice());
				shoppingCart.setProducts_quantity(newCart.getProducts_quantity());
				return shoppingCartRepository.save(shoppingCart);
			})
               .orElseGet(() -> shoppingCartRepository.save(newCart));
	}
}

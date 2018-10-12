package globant.topic6.dao;

import globant.topic6.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
/**
 *
 * @author Emiliano
 */
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
/**

    @Override    
    @Query("select * from ShoppingCart")
    List<ShoppingCart> findAll();

    @Query("select * from ShoppingCart c where c.cart_id = ?1")
    ShoppingCart getCartById(Long id);
    
    @Query("insert into ShoppingCart values (?1, ?2, ?3)")
    ShoppingCart addCart(Long cartId, double totalPrice, int prod_id);
        
    @Query("update ShoppingCart set total_price = ?2, product_id = ?3 where shoppingCart_id = ?1")
    ShoppingCart updateCartById(Long cartId, double totalPrice, int prod_id);
     */   
}

package globant.topic6.dao;

import globant.topic6.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
/**
 *
 * @author Emiliano
 */
public interface UserRepository  extends JpaRepository<User, Long> {
   /* 
    @Override    
    @Query("select * from Users")
    List<User> findAll();

    @Query("select * from Users u where u.users_id = ?1")
    User getUserById(Long id);
    
    @Query("insert into Users values (?1, ?2, ?3, ?4, ?5, ?6)")
    User addUser(Long userId, String user_name, String pass, String name, int cartId, int product_id);
        
    @Query("update ShoppingCart set pass = ?3, name = ?4,  cart_id = ?5, product_id ?6 where userId = ?1")
    User updateUserById(Long userId, String user_name, String pass, String name, int cartId, int product_id);
    
     */   
}

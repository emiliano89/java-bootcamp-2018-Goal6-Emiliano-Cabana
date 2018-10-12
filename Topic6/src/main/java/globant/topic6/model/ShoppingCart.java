package globant.topic6.model;

//import java.io.Serializable;
import java.util.List;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.OneToMany;
/**
 *
 * @author Emiliano
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ShoppingCart implements Serializable{
    private @Id @GeneratedValue Long cartId;
    private double totalPrice;  
    @OneToMany
    private List<Product> products;
    
}

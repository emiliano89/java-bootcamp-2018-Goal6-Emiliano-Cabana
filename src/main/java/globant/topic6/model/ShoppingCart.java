package globant.topic6.model;

//import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author Emiliano
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ShoppingCart {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)int cart_id;
    private double totalPrice;  
    private int products_quantity;
    
    public ShoppingCart(double totalPrice, int products_quantity) {
       this.totalPrice = totalPrice;
       this.products_quantity = products_quantity;
    }
}

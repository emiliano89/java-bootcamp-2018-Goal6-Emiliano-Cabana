package globant.topic6.model;

import java.io.Serializable;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

/**
 *
 * @author Emiliano
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

        private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) int product_id;
        private String product_name;
        private double price;
        private int quantity;
        
        public Product(String product_name, double price, int quantity) {
           this.product_name = product_name;
           this.price = price;
           this.quantity = quantity;
        }
}

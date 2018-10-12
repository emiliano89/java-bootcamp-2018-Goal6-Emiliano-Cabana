package globant.topic6.model;

import java.io.Serializable;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 *
 * @author Emiliano
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product implements Serializable {

        private @Id @GeneratedValue Long product_id;
        private String product_name;
        private double price;
        private int quantity;
}

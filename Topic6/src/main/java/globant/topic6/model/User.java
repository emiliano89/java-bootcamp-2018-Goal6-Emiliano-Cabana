package globant.topic6.model;

import lombok.*;
import java.io.Serializable;
import java.util.List;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 *
 * @author Emiliano
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User implements Serializable{
    private @Id @GeneratedValue Long userId;
    private String user_name;
    private String pass;
    private String name;
    @OneToMany
    private List<ShoppingCart> cart;
    
}

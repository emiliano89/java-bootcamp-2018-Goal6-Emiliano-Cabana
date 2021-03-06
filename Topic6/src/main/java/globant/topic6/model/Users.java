package globant.topic6.model;

import lombok.*;
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
public class Users {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) int user_id;
    private String user_name;
    private String pass;
    private String real_name;
    
    public Users(String user_name, String pass, String real_name) {
       this.user_name = user_name;
       this.pass = pass;
       this.real_name = real_name;
    }
}

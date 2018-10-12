package globant.topic6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import globant.topic6.service.*;
import globant.topic6.dao.*;
import globant.topic6.model.*;
import globant.topic6.configuration.*;
/**
 *
 * @author Emiliano
 */
@SpringBootApplication
public class CartApp {
    	public static void main(String... args) {
		SpringApplication.run(CartApp.class, args);
	}
}

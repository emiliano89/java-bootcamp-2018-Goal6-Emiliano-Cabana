package globant.topic6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Emiliano
 */
@SpringBootApplication(scanBasePackages = {"globant.topic6.controller", "globant.topic6.repositories","globant.topic6.service","globant.topic6.model"})
public class CartApp {
    	public static void main(String... args) {
		SpringApplication.run(CartApp.class, args);
	}
}

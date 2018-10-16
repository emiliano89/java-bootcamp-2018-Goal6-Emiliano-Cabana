package globant.topic6.service;

import globant.topic6.model.Users;
import globant.topic6.repositories.UserRepository;
import java.util.List;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Emiliano
 */
@Service
@AllArgsConstructor
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public List<Users> getUsers() {
       return userRepository.findAll();
   }
   
   public Users addUser(Users user) {
       return userRepository.save(user);
   }
   
   public Users getOneUser(int id) {
      return userRepository.getOne(id);
   }
   
   public void deleteUserById(int id) {
      userRepository.deleteById(id);
   }
   
   public Users replaceUserById(Users newUser, int id) {
	return userRepository.findById(id)
			.map(user -> {
				user.setUser_name(newUser.getUser_name());
				user.setPass(newUser.getPass());
                                user.setReal_name(newUser.getReal_name());
				return userRepository.save(user);
			})
			.orElseGet(() -> {
				return userRepository.save(newUser);
			});
	}
}

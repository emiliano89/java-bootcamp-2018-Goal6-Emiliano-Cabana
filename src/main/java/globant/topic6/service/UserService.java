package globant.topic6.service;

import globant.topic6.model.Users;
import globant.topic6.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
   
   public Optional<Users> getOneUser(int id) {
      return userRepository.findById(id);
   }
   
   public void deleteUserById(int id) {
      userRepository.deleteById(id);
   }
   
   public Users replaceUser(String user_name, String pass, String real_name, int id) {
       Users newUser = new Users(user_name,pass,real_name);
	return userRepository.findById(id)
			.map(user -> {
				user.setUser_name(newUser.getUser_name());
				user.setPass(newUser.getPass());
                user.setReal_name(newUser.getReal_name());
				return userRepository.save(user);
			})
            .orElseGet(() -> userRepository.save(newUser));
	}
}

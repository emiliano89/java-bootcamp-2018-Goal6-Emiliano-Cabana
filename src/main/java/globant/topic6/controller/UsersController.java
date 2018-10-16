package globant.topic6.controller;

import globant.topic6.model.Users;
import globant.topic6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Emiliano
 */
@RestController
public class UsersController {
    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
	this.userService = userService;
    }

    
    @GetMapping(path = "/users")
    public List<Users> getAll() {
		return userService.getUsers();
	}
        
    @PostMapping(path = "/users/addUser")
    public Users addUser(@RequestParam(name = "user_name") String user_name,
                              @RequestParam(name = "pass") String pass,
                              @RequestParam(name = "real_name") String real_name) {
        Users user = new Users (user_name, pass, real_name);
		return userService.addUser(user);
	}
    
        
    @GetMapping(path = "/users/{id}")
    public Optional<Users> getOneUser(@PathVariable(value = "id") int id ) {
            return userService.getOneUser(id);
	}
    
    @DeleteMapping(path = "/users/{id}")
    public void deleteUserById(@PathVariable(value = "id") int id) {
	   userService.deleteUserById(id);
	}

    @PutMapping("/users/{id}")
    public Users replaceUser(@RequestParam(name = "user_name") String user_name,
                                 @RequestParam(name = "pass") String pass,
                                 @RequestParam(name = "real_name") String real_name, @PathVariable(value = "id") int id) {
          return userService.replaceUser(user_name,pass,real_name, id);
    }
}

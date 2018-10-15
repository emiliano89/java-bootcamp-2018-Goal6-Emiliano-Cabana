package globant.topic6.controller;

import globant.topic6.model.Users;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import globant.topic6.service.UserService;
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
    
        
    @GetMapping(path = "/users/getOneUser")
    public Users getOneUser(@RequestParam(name = "id") int id ) {
            return userService.getOneUser(id);
	}
    
    @DeleteMapping(path = "/users/deleteUserById")
    public void deleteUserById(@RequestParam int id) {
	   userService.deleteUserById(id);
	}

    @PutMapping("/products/replaceUserById")
    public Users replaceUserById(@RequestBody Users newUser, @PathVariable int id) {
          return userService.replaceUserById(newUser, id);
    }
}

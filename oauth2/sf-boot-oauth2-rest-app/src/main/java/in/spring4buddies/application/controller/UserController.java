package in.spring4buddies.application.controller;

import in.spring4buddies.application.model.User;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

//	@Autowired
//	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> listUser() {
		List<User> users = Arrays.asList(new User(1l,"X",1000,25));
		return users;
		
//		return userService.findAll();
	}

//	@RequestMapping(value = "/user", method = RequestMethod.POST)
//	public User create(@RequestBody User user) {
//		return userService.save(user);
//	}
//
//	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
//	public String delete(@PathVariable(value = "id") Long id) {
//		userService.delete(id);
//		return "success";
//	}

}
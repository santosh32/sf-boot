package in.spring4buddies.application.controller;

import in.spring4buddies.application.model.UserDetails;
import in.spring4buddies.application.service.UserServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<UserDetails> listUser() {
		return userService.getUserDetails();
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
package in.spring4buddies.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LoginController {

	@GetMapping("/login")
	public Message login() {
		return new Message("Normal resource ");
	}

	@GetMapping("/secured")
	public Message secured() {
		return new Message("Secured resource ");
	}
}

package in.spring4buddies.application.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OAuthController {

	@GetMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
}

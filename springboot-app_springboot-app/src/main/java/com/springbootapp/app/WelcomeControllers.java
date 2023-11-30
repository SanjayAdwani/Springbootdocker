package com.springbootapp.app;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeControllers {

	@GetMapping("/Welcome")
	public String Welcome() {
		return "spring boot docker app";
	}
}

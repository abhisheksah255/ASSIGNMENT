package com.abhisheksah;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/")
	public String hello() {
		String input = "<h1>Welcome to the Home World</h1>";
		return input;
	}

	@GetMapping("/admin")
	public String Admin() {
		String text = "<h1> Myself Abhishek Kumar Sah and I am the Admin</h1> ";
		return text;
	}

	@GetMapping("/user")
	public String user() {
		String text = "<h1> Myself Demon and I am the User</h1> ";
		return text;
	}
}

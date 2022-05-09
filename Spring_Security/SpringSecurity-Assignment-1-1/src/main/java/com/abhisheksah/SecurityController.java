package com.abhisheksah;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/admin")
	public String hello(){
		 String text="<h1> Myself Abhishek Kumar Sah and I am the Admin</h1> ";
		return text;
	}
}


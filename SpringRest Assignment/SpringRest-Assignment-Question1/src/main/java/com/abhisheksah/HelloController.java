package com.abhisheksah;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String firstcode() {
		return "Hello World by Abhishek Kumar Sah";
	}
}

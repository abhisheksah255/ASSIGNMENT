package com.abhisheksah;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@RequestMapping("/add")
	public String add() {
		int a=10;
		int b=20;
		return "<h1>The Sum of a and b:- "+(a+b)+"</h1>";
	}
	@RequestMapping("/")
	public String home() {
		return "<h1> Welcome to My First Web Security Page</h1> ";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "<h1> Welcome to My Admin Page</h1> ";
	}

	@RequestMapping("/user")
	public String user() {
		return "<h1> Welcome to My User Page</h1> ";
	}
}

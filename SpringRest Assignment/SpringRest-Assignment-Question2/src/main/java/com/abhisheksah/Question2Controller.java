package com.abhisheksah;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question2Controller {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/userdetails")
	public List<UserCredentials> getDetails(){
		return userService.getDetails();
		
	}
	
	@GetMapping("/userdetails/{username}/{password}")
	public UserCredentials checkdetails(@PathVariable Object username,Object password) {
		try {
			
			System.out.println(HttpStatus.ACCEPTED);
			return userService.checkdetails(username,password);
			
		} catch (Exception e) {
		}
		return userService.checkdetails("wrong credential",HttpStatus.NOT_FOUND);
	}
}

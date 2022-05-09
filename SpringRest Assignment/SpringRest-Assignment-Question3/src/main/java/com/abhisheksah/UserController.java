package com.abhisheksah;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;


@GetMapping("/home")
public String home() {
	return "hello home page";
}

@GetMapping("/userdetail")
public List<UserDetail> getDetail(){
	return this.userService.getDetail();
}

@GetMapping("/userdetail/{zipcode}")
public UserDetail getDetailbyZipcode(@PathVariable long zipcode) {
	return this.userService.getDetailbyZipcode(zipcode);
	
}




}
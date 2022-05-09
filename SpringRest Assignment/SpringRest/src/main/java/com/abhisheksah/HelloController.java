package com.abhisheksah;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller            these two control work same as of restcontroller
//@ResponseBody		insted og using these two we use one which is restcontroller

@RestController
public class HelloController {

	//http://localhost:8080/hello     to check the request
	@GetMapping("/hello")//this method is use to handle Http request
	public String Hello() {
		return "Hello Abhishek";
	}
	
	
}

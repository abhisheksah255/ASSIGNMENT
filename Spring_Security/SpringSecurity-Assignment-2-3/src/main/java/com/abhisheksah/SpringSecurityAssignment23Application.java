package com.abhisheksah;
/*
 These days Applications offers remember the identity of user between sessions. 
 Basically, during login, when you ask for Remember-Me support, application will 
 send a cookie to the browser during login. This cookie will be stored at browser 
 side and will remain there for certain period(defined by cookie lifetime). 
 Next time when you try to access the application, browser will detect the 
 cookie (if still valid) and user will be automatically logged in, without providing userid/password
  e.g. create sample login Spring security application using Hash-Based Token Approach
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityAssignment23Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAssignment23Application.class, args);
	}

}

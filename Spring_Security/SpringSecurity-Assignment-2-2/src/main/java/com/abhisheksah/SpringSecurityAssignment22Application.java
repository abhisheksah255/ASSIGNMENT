package com.abhisheksah;
/*
 Any application, which takes Security seriously, should NEVER store passwords in 
 plain text format. Passwords should always be encoded using a secure hashing 
 algorithm. There are many standard algorithms like SHA or MD5 which combined 
 with a proper SALT can be a good choice for password encoding. 
 Create Sample login Spring Security application which provides 
 BCryptPasswordEncoder, and implementation of Spring’s PasswordEncoder 
 interface that uses the BCrypt strong hashing function to encode the password
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityAssignment22Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAssignment22Application.class, args);
	}

}

package com.abhisheksah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhisheksah.helper.JwtHelper;
import com.abhisheksah.model.JwtRequest;
import com.abhisheksah.model.JwtResponse;
import com.abhisheksah.services.CustomUserDetailsService;

import ch.qos.logback.core.subst.Token;

@RestController
public class JwtController {

	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	@Autowired
	private JwtHelper jwtHelper;
	
	/*
	 * @RequestMapping("/") public String hello() { String
	 * input="<h1>Welcome to our Security Concept</h1>"; input
	 * +="<h2> /n where we are going to understand what is JWT and how we are going to use</h2>"
	 * ; return input; }
	 */

	@PostMapping("/token")
	public  ResponseEntity<?>   generateToken(@RequestBody JwtRequest jwtRequest ) throws Exception
	{
		System.out.println(jwtRequest);
		try {
			this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
		} catch (UsernameNotFoundException e) {
			e.printStackTrace();
			throw new Exception("Bad Credentials");
		}
	UserDetails userDetails=this.customUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
	String token=jwtHelper.generateToken(userDetails);
	System.out.println("jwt" +token);
	
	return ResponseEntity.ok(new JwtResponse(token));
	}
	

}

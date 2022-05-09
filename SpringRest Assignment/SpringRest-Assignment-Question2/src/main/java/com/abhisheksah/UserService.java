package com.abhisheksah;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private  List<UserCredentials> login=Arrays.asList(
		new UserCredentials("abhishek@199","password"),
		new UserCredentials("ankit@123","password"),
		new UserCredentials("mohit@098","password"),
		new UserCredentials("akash@1020","password")
);	
public List<UserCredentials>getDetails(){
	return login;
}

public UserCredentials checkdetails(Object username,Object password) {

	return login.stream().filter(t->t.getUsername().equals(username) || t.getPassword().equals(password)).findFirst().get();
}

}

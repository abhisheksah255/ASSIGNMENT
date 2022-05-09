package com.abhisheksah;

public class UserCredentials {

	private Object username;
	private Object password;
	
	public UserCredentials(Object username, Object password) {
		super();
		this.username = username;
		this.password = password;
	}

	public UserCredentials() {
		super();
	}

	public Object getUsername() {
		return username;
	}

	public void setUsername(Object username) {
		this.username = username;
	}

	public Object getPassword() {
		return password;
	}

	public void setPassword(Object password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserCredentials [username=" + username + ", password=" + password + "]";
	}

}

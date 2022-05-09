package com.abhisheksah;
/*
 Create a RESTful web service that returns state, city and country information when user passes zipcode. You can send state, city and country information in JSON format.
Sample Input: 99501
Sample output: {"state": "AK", City: "ANCHORAGE", "country: "US"}
 */

public class UserDetail {

	private long zipcode;
	private String state;
	private String city;
	private String country;
	
	public UserDetail(long zipcode, String state, String city, String country) {
		super();
		this.zipcode = zipcode;
		this.state = state;
		this.city = city;
		this.country = country;
	}

	public UserDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserDetail [zipcode=" + zipcode + ", state=" + state + ", city=" + city + ", country=" + country + "]";
	}
	
	
	
}

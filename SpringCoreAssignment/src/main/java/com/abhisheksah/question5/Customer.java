package com.abhisheksah.question5;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;



public class Customer {

	 private int customerId;
	 private String customerName;
	 private long customerContact;
	 
	 
	// @Inject
	 	@Resource(name="addressvalue")
		 private Address address;
	 	
	 public Customer(int customerId, String customerName, long customerContact, Address address) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerContact = customerContact;
			this.address = address;
		}

	public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}

	@SuppressWarnings("deprecation")
	@Required
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", address=" + address + "]";
	}


	 

}

package com.abhisheksah.question9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Lifecycle implements InitializingBean,DisposableBean {
	private String name;
	private int age;
	private String address;
	private String description;
	
	public Lifecycle(String name, int age, String address, String description) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.description = description;
	}

	public Lifecycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Lifecycle [name=" + name + ", age=" + age + ", address=" + address + ", description=" + description
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress()
				+ ", getDescription()=" + getDescription() + "]";
	}

	public void destroy() throws Exception {
	System.out.println("By implement DisposableBean ");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("By implement InitilizationBean ");
		
	}
	
	public void initmethod() {
		System.out.println("This is the Init method ");
	}
	
public void destroymethod() {
	System.out.println("This is the Destroy method ");
}
}

package com.abhisheksah.question10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements ApplicationContextAware,BeanNameAware {

	private int id;
	private String name;
	private String company;
	private long salary;
	private ApplicationContext context=null;
	
	public Employee(int id, String name, String company, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", salary=" + salary + "]";
	}

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		
		this.context=context;
	}
	
	public void setBeanName(String beanName) {
		System.out.println("The name of the bean is:-"+beanName);
		
	}


	
	
}

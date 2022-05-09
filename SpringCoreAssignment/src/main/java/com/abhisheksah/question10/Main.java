package com.abhisheksah.question10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("com/abhisheksah/question10/Application.xml");
Employee employee=(Employee)context.getBean("employeedetails");
System.out.println(employee);
	}

}

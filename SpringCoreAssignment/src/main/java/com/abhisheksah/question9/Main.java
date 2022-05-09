package com.abhisheksah.question9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext value=new ClassPathXmlApplicationContext("com/abhisheksah/question9/lifecycle.xml");
		value.registerShutdownHook();
		Lifecycle cycle=(Lifecycle)value.getBean("lifecycle");
		System.out.println(cycle);

	}

}

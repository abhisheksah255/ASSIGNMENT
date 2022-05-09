package com.abhisheksah.question7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext data= new ClassPathXmlApplicationContext("com/abhisheksah/question7/config.xml");
Spel example=data.getBean("spel",Spel.class);
System.out.println("**example of SPEL**");
System.out.println(example);
	}

}

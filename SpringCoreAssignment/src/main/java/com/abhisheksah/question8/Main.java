package com.abhisheksah.question8;

import java.nio.channels.ShutdownChannelGroupException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AbstractApplicationContext data=new ClassPathXmlApplicationContext("com/abhisheksah/question8/config.xml");
		 data.registerShutdownHook();
		 //Initdestroy input=(Initdestroy)data.getBean("detail");
		 //System.out.println(input);
		 Initdestroybyannotation ab=(Initdestroybyannotation)data.getBean("student");
		 System.out.println(ab);
	}

}

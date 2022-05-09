package com.abhisheksah.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
ApplicationContext factory=new ClassPathXmlApplicationContext("com/abhisheksah/question2/collection.xml");
Question inputs=(Question)factory.getBean("data");
Question input1=(Question)factory.getBean("data1");

System.out.print(inputs.getQuestionId()+" ");
System.out.println(inputs.getQuestion());
System.out.print(input1.getQuestionId()+" ");
System.out.println(input1.getQuestion());
System.out.println("********Answer by List**************");
System.out.println(inputs.getAnswer());
System.out.println("********Answer by Set**************");
System.out.println(inputs.getAnswer1());
System.out.println("********Answer by Map**************");
System.out.print(inputs.getAnswer2());
	}
 
}

package com.abhisheksah.question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("**Program to write detail of customer and address by using Spring core**");
         ApplicationContext context=new ClassPathXmlApplicationContext("com/abhisheksah/question5/annotation.xml");
         Customer customer=(Customer)context.getBean("customer");
      QuestionAnnotation qa=(QuestionAnnotation)context.getBean("student");
      System.out.println("**example of resource inject annotation***");
      System.out.println(qa);
      System.out.println("**example of resource Resource annotation***");
         System.out.println(customer);

    }
    
}


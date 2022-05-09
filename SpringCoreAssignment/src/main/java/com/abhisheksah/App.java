package com.abhisheksah;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhisheksah.question1.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("**Program to write detail of customer and address by using Spring core**");
         ApplicationContext context=new ClassPathXmlApplicationContext("com/abhisheksah/config.xml");
//         Customer customer1=(Customer)context.getBean("customer1");
//         Customer customer2=(Customer)context.getBean("customer2");
//         System.out.println(customer1);
//         System.out.println(customer2);
         Customer customerdata=(Customer)context.getBean("dataofcustomer");
//         System.out.println(customerdata.getCustomerId());
//         System.out.println(customerdata.getCustomerName());
//         System.out.println(customerdata.getCustomerContact());
//         System.out.println(customerdata.getCustomerAddress().getCountry());
//         System.out.println(customerdata.getCustomerAddress().getState());
//         System.out.println(customerdata.getCustomerAddress().getCity());
//         System.out.println(customerdata.getCustomerAddress().getZip());
//         System.out.println(customerdata.getCustomerAddress().getStreet());
         System.out.println(customerdata);
         Customer customer2=(Customer)context.getBean("customer2");
         System.out.println(customer2);
         Customer customer3=(Customer)context.getBean("customer3");
         System.out.println(customer3);
    }
    
}


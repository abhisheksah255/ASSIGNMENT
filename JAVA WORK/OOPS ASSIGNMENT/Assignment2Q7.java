/*
 Develop an application for Dessert shop. The application should allow owner to add items like Candy, Cookie or Ice Cream in the shop storage. Also customers should be able to place an order.

DessertItem is an abstract class having an abstract method getCost(). Every dessert item has tax associated. Candy item is sold in dollar currency, Cookie in Euro currency & Ice Cream in Rupees currency. The sub classes are supposed to override these methods. When we run the application, it should ask us our role i.e. owner or customer. If role is owner, we should be able to add dessert items in our storage. If role is customer, then we should be able to place an order. The currency conversion rates are:

1 dollar = 60 rupees.

1 euro = 70 rupees.


 */

import java.util.Scanner;

abstract class DesertShop {
    abstract public int getCost(int amount);
}

class Candy extends DesertShop {
	public int getCost(int amount) {
		System.out.println("Candies: "+amount);
		int cost = amount*60;
		System.out.println("The cost of Candies is: "+ cost);
		return cost;
		
	}
    public int addCandies(int candies){
    	System.out.println("Candies added Successfully.");
    	return candies;
    }
}

class Cookie extends DesertShop {
	public int getCost(int amount) {
		System.out.println("Cookies: "+amount);
		int cost = amount*70;
		System.out.println("The cost of Cookies is: "+ cost);
		return cost;
	}
    public int addCookies(int cookies){
    	System.out.println("Cookies  are added Successfully");
    	return cookies;
    }
}
class IceCream extends DesertShop {
	public int getCost(int amount) {
		System.out.println("Ice Creams: "+amount);
		int cost = amount*100;
		System.out.println("The cost of Ice Creams are : "+ cost);
		return cost;
	}
    public int addIceCreams(int ice){
    	System.out.println("Ice Creams Are Adeed Successfully.");
    	return ice;
    }
}
public class Assignment2Q7 {

	static Assignment2Q7 add = new Assignment2Q7();
	Scanner ab = new Scanner(System.in);
	DesertShop candies = new Candy();
	DesertShop cookies = new Cookie();
	DesertShop icream = new IceCream();
	
	public static void main(String[] args) {

		add.selectRoles();
	}
	 private void selectRoles(){
		 System.out.println("Enter the role you want to choose (customer/owner): ");
		 String role = new String();
		 role = ab.next();
		 System.out.println("Your role is: "+ role);
		 roles(role);
		 
	 }
	 private void roles(String role){
		 System.out.println("Role has been assigned.");
		 if(role.equals("customer")) {
			 add.placeOrder();
			 
		 } else if (role.equals("owner")) {
			 add.addItems();
			 
		 } else {
			 System.out.print("Invalid role.");
		 }
	 }
	 private void addItems() {
		 System.out.println("List of items you can add: ");
		 System.out.println("1. Candy");
		 System.out.println("2. Cookie");
		 System.out.println("3. Ice Cream");
		 System.out.println("Enter the number: ");

		 int number = ab.nextInt();
		 switch(number) {
		 case 1->{
			 System.out.println("How many candies?");
			 int candy = ab.nextInt();
			 System.out.println(candy+" candies entered.");
			 add.addItemsOperation(candy);
		 }
		 case 2->{
			 System.out.println("How many cookies?");
			 int cookie = ab.nextInt();
			 System.out.println(cookie+" cookies entered.");
			 add.addItemsOperation(cookie);
		 }
		 case 3->{
			 System.out.println("How many ice creams?");
			 int iceCream = ab.nextInt();
			 System.out.println(iceCream+" ice creams entered.");
			 add.addItemsOperation(iceCream);
		 }
		 default->{
			 System.out.println("Enter 1 or 2 or 3 only.");
		 }
		 }

	 }
	 private void addItemsOperation(int choice) {
	    	int items = choice;
	    	System.out.println(items + " Items are  added by owner.");
	  
	 }
	 private void placeOrder() {
		 System.out.println("List of items you can Order : ");
		 System.out.println("1.Price of  Candy - - - Rs. 60");
		 System.out.println("2.Price of  Cookie - - - Rs. 70");
		 System.out.println("3.Price of  Ice Cream - - - Rs. 100");
		 System.out.println("Select the item which you want to purchase  :- ");
		 

		 int number = ab.nextInt();
		 switch(number) {
		 case 1->{		
			 System.out.println("How many Candies you want to add?");
			 int candy = ab.nextInt();
			 System.out.println(candy+" candies entered.");
			 candies.getCost(candy);
		
		 }
		 case 2->{
			 System.out.println("How many Cookies you want to add?");
			 int cookie = ab.nextInt();
			 System.out.println(cookie+" cookies entered.");
			 cookies.getCost(cookie);
		 }
		 case 3->{
			 System.out.println("How many Ice creams you want to add?");
			 int iceCream = ab.nextInt();
			 System.out.println(iceCream+" ice creams entered.");
			 icream.getCost(iceCream);
		 }
		 default->{
			 System.out.println("Enter 1 or 2 or 3 only.");
		 }
		 }
		 placeOrderOperation(number);
		 
	 }
	 private void placeOrderOperation(int choice) {
		 System.out.println("Thank you !");
		 
	 }

}
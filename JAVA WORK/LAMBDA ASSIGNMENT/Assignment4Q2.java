/*
  Write an application using lambda expressions to print Orders having 2 criteria implemented: 1) order price more than 10000 2) order status is ACCEPTED or COMPLETED.
 */

import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment4Q2 {

    private int totalPrice;
    private String status;

    public Assignment4Q2(int totalPrice, String status) {
		this.totalPrice = totalPrice;
		this.status = status;
	}
	public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> arr, Predicate<Assignment4Q2> pr) {
		
		ArrayList<Assignment4Q2> data = new ArrayList<>();
		for (Assignment4Q2 index : arr)
		{
			if( pr.test(index))
			{
				System.out.println("totalPrice : " + index.totalPrice + " Status : "+index.status);
			}
		}
		
		return data;
		
	}
    
    
    public static void main(String[] args) {
    	
    	ArrayList<Assignment4Q2> data = new ArrayList<>();
    	data.add(new Assignment4Q2(1000000, "completed"));
    	data.add(new Assignment4Q2(1000, "pending"));
    	data.add(new Assignment4Q2(10001, "accepted"));
    	data.add(new Assignment4Q2(125000, "completed"));
    	data.add(new Assignment4Q2(125, "completed"));
    	
    	Predicate<Assignment4Q2> pr=e->(e.totalPrice>10000 && (e.status.contentEquals("accepted") || e.status.contentEquals("completed")));
    	listOfOrders(data, pr);    	
    }
}

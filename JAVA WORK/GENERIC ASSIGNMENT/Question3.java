//3.) Write a generic method to exchange the positions of two different elements in an array.
import java.util.*;
public class Question3 {

	public static void main(String[] args) {
	ArrayList<Integer> data=new ArrayList<>();
	data.add(5);
	data.add(51);
	data.add(14);
	data.add(49);
	data.add(50);
	data.add(41);
	data.add(12);
	data.add(65);
	data.add(54);
	System.out.println("Value Before Swapping:-"+data);
	
	System.out.println("Swapping the 1st and 5 element in the ArrayList:-");
	Collections.swap(data, 1, 5);
	System.out.println("Value After Swapping:-"+data);
	}
	
	}



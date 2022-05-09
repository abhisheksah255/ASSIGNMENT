/*
 * Create a new thread that prints the numbers from the list. Use class Thread & interface Consumer.
 */
import java.util.ArrayList;

public class Assignment4Q8 {
	public static void main(String[] args) {
		ArrayList<Integer> Arraydata = new ArrayList<>();
		Arraydata.add(2);
		Arraydata.add(6);
		Arraydata.add(9);
		Arraydata.add(4);
		Arraydata.add(1);
		
		Thread myThread = new Thread( () -> Arraydata.forEach(n -> System.out.println(n)));
		myThread.start();
	}

}
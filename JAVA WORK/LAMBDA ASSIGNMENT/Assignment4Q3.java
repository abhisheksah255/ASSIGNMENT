/*
 * Use the functional interfaces Supplier, Consumer, Predicate & Function to invoke built-in methods from Java API.
 */

import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class phone {
	String brand = "Redmi";
}

public class Assignment4Q3 {
	static void modifyValue(int val) {
		System.out.println("Value is: " + val);
	}

	static void display() {
	}

	public static void main(String[] args) {
		phone product = new phone();
		System.out.println("*****Implementations of supply******");
		Supplier<Boolean> boolSupplier = () -> product.brand.length() == 5;
		System.out.println(boolSupplier.get()); 
		System.out.println("*****Implementations of consumer******");
		Consumer<Integer> consumer = Assignment4Q3::modifyValue; 
		consumer.accept(20); 

		LinkedList<String> name = new LinkedList<String>();
		name.add("Abhishek");
		name.add("Anirban");
		name.add("Ankush");
		name.add("Arvind");
		name.add("Mohan");
Predicate<String> greaterthensix=data->data.length()<=6;
name.removeIf(greaterthensix);
System.out.println("*****Implementations of predicate******");
		System.out.println(name);  
		
		Function<Integer, Integer> multiply = x -> x*2;   
		System.out.println("*****Implementations of function******");	   
		System.out.println(multiply.apply(3));

	}
}
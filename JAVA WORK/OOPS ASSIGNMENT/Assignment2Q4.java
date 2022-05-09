/*
 Test the following principles of an abstract class:

• If any class has any of its method abstract then you must declare entire class abstract.

• Abstract class cannot be instantiated.

• When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.

• Abstract class cannot be private.

• Abstract class cannot be final.

• You can declare a class abstract without having any abstract method.

Description:-

Write a program in such a way that all the conditions above for abstract class should satisfy.
 */
abstract class Abhi{
	abstract public void checking(); 

	public void check() {
		System.out.println("Inside the  Abstract class.");
	}
}
class Dhiru extends Abhi{ 
	public void cheating() { //overriding abstract method in extended class.
		System.out.println("Overridden  the method of abstract class ");
	}

	@Override
	public void checking() {
		System.out.println("I am inside Abhi class");
		
	}
}
public class Assignment2Q4 {

	public static void main(String[] args) {
		

	
		Dhiru data = new Dhiru(); 
		Abhi value = new Dhiru(); 
		data.cheating();
		data.checking();
		value.check();
		value.checking();
	}

}
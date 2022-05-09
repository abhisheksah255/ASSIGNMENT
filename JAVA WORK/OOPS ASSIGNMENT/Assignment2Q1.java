/*
 Write a singleton class. Confirm that singleton class cannot be inherited.
 class SingletonInheritanceCheck{ }
public class Assignment2Q1 {}


 */

public class Assignment2Q1 {

	public static void main(String[] args) {
		SingletonInheritanceCheck data=SingletonInheritanceCheck.getInstance();
		SingletonInheritanceCheck data1=SingletonInheritanceCheck.getInstance();
		
	}
}
class SingletonInheritanceCheck{ 
	
	static SingletonInheritanceCheck data=new  SingletonInheritanceCheck();
	private SingletonInheritanceCheck() {
		System.out.println("SingletonInheritanceCheck is successfully created");
	}
	public static synchronized SingletonInheritanceCheck getInstance() {
		if(data==null) {
			data=new SingletonInheritanceCheck();
		}
		return data;
	}
}


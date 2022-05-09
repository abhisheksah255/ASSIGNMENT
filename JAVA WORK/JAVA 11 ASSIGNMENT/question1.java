/*
 Write a program to calculate the Simple Interest with minimal code using features of
Java 11.
Hint: Use the concept of functional interface and Local variable syntax for lambda
parameters.
 */
public class question1 {

	public static void main(String[] args) {
		System.out.println("Program to calculate SI by using Lambda ");
	SimpleIntrest SI=(P, R, T) -> (P*R*T)/100;
	System.out.println("SIMPLE INTREST:-"+SI.Sum(12000, 45, 2.6));
}
}
@FunctionalInterface
interface SimpleIntrest{
	double Sum(double P,double R,double T);
}


	

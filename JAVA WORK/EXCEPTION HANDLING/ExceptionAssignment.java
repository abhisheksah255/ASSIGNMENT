import java.util.Scanner;

/*
 1) Write an application that accepts two numbers, divides the first number with the second
number and display the result. Hint: You need to handle ArithmeticException which is
thrown when there is an attempt to divide a number by zero.
 */

public class ExceptionAssignment {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the first number a:-");
		int a=sc.nextInt();
		System.out.println("Enter the second number b:-");
		int b=sc.nextInt();
		sc.close();
		float Divide=0;
		Divide=a/0;
		System.out.println("this is the result of division:-"+Divide);
		}
		catch(ArithmeticException exp) {
			System.out.println("Exception occur in your code :"+exp);
		}
		System.out.println("Code run Successfully ");
			}
		}
		
		

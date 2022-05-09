/*
 Write an application to perform basic arithmetic operations like add, subtract, multiply & divide. You need to define a functional interface first.
 */
interface Airthmetic{
	int Operation(int a,int b);
}
public class Assignment4Q1 {
	public static double addition(int num1,int num2){
		Airthmetic addition= (a, b)-> a+b;
		return (addition.Operation(num1, num2));
		}
    public static  double subtraction(int num1,int num2){
    	Airthmetic Subtraction=(a,b)->a-b;
		return (Subtraction.Operation(num1, num2));
    	
    }
    public static double multiplication(int num1,int num2){
    	Airthmetic multiplication=(a,b)-> a*b;
    	return (multiplication.Operation(num1, num2));
    }
    public static double division(int num1,int num2){
    	Airthmetic  division=(a,d)->a/d;
		return (division.Operation(num1, num2));
    	
    }
    public static void main(String[]args) {
    	System.out.println("Addition of 13 & 15 :-");
    	System.out.println(addition(13,15));
    	System.out.println("Subtraction of 32 & 15 :-");
    	System.out.println(subtraction(32,15));
    	System.out.println("multiplication of 23 & 5 :->");
    	System.out.println(multiplication(23,5));
    	System.out.println("division of 13 & 5 :->");
    	System.out.println(division(13, 5));
    }

}

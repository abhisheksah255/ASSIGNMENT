//This program is to check the Simple Interest and Compound Interest 
import java.util.Scanner;

class SiCi{
	public double simpleInterest(double principalAmount, int time, double interestRate) {
		double si = (principalAmount * interestRate * time)/100;
		System.out.println("The Simple Interest is: "+ si);
		return si;
	}
	
	public double compoundInterest(double principalAmount, int time, double interestRate) {
		double ci = principalAmount * Math.pow((1 + interestRate), time) - principalAmount;
		System.out.println("The Compound Interest is: "+ ci);
		return ci;
	}
}
public class Assignment1Q3 {

	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			
			System.out.print("Enter the principal amount:- ");
			double p = s.nextDouble();
			System.out.print("Enter the time:- ");
			int t = s.nextInt();
			System.out.print("Enter the rate of interest:- ");
			double r = s.nextDouble();
			
			SiCi sc = new SiCi();
			sc.simpleInterest(p, t, r);
			sc.compoundInterest(p, t, r);
		}
	}

}

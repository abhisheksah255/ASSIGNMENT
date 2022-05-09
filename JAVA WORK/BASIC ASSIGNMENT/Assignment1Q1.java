//program for Armstrong number or not

class ArmstrongOrNot {
	
	public boolean armstrongCheck(int num) {
		 int arm=0,rem,x;
		x=num;
	
		while(num>0) 
		{
			rem = num%10;
			arm=(rem*rem*rem)+arm;
			num=num/10;
		}
		if(x==arm)
			System.out.println("This is an Armstrong number="+x);
		else
			System.out.println("This is not an Armstrong number="+x);
		return false;
	}
}
public class Assignment1Q1 {
	public static void main(String args[]) {
		System.out.println("This program is to check no is Armstrong or not");	
			ArmstrongOrNot abhi1=new ArmstrongOrNot();
			abhi1.armstrongCheck(371);
}
}

//This program is to check the Armstrong number between 100 to 999

class ArmstrongNumBetweenRange{
	public void armstrongNumbersInRange(int min, int max) {
		int num;
		while(min < max) {
		    num = armstrongOrNot(min);
		    if(num == min) {
		    	 System.out.print(min + " ");
			    }	   
		    min++;
		 }
	}
	
	static int armstrongOrNot(int num)
	{
		int x, a = 0;
		while(num != 0)
		{
			x = num%10;
			a = a + (x*x*x);
			num /= 10 ;
		}
		return a;
	}
}

public class Assignment1Q2 {

	public static void main(String[] args) {
		
		int min = 100;
		int max = 999;
		System.out.println("Armstrong Numbers between 100 to 999 are :-");
		ArmstrongNumBetweenRange a = new ArmstrongNumBetweenRange();
		a.armstrongNumbersInRange(min, max);
	}
}
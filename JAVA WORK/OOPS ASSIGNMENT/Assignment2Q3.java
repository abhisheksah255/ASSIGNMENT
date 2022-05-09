/*
  Write a program to consider saving & current account in the bank. Saving account holder has ‘Fixed Deposits’ whereas Current account holder has cash credit. Apply polymorphism to find out total cash in the bank.
 */
import java.util.ArrayList;
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 100;
    int creditLimit = 10;
    
    public int getCash() 
    {
    	
    	return totalDeposits-creditLimit;
    }
    
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 5000;
    int fixedDepositAmount = 500;
    @Override
    public int getCash()
    {
    	return totalDeposits+fixedDepositAmount;
    }
}

	public class Assignment2Q3 {

    public int getCash()
    {
    	return 0;
    }
	public static void main(String[] args) 
	{
		Assignment2Q3 data_1 =new Assignment2Q3();
		ArrayList<Integer> Cash = new ArrayList<Integer>();
		CurrentAccount data_2 = new CurrentAccount();
		System.out.println(data_2.getCash());
		SavingsAccount data_3 = new SavingsAccount();
		System.out.println(data_3.getCash());
		Cash.add(data_2.getCash());
		Cash.add(data_3.getCash());
		System.out.println("Total Amount Present into the bank:-"+data_1.totalCashInBank(Cash));
	}
	 public int totalCashInBank(ArrayList<Integer> cash)
	 {
		 int sum=0;
		 for(int i: cash)
		 {
			 sum=sum+i;
		 }
	
		 return sum;
	 }
}

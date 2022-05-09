/*
 3) Write an application to perform withdraw functionality on a SavingAccount object.
  Point to note:

a. Raise InsufficientBalanceException if you are trying to withdraw more than balance
or when you balance is zero. E.g. if you balance is 2000 and if you are trying to
withdraw 2100 or if you balance is 0 and you are trying to withdraw positive value.

b. Raise IllegalBankTransactionException if you are trying to withdraw a negative value
from your balance. E.g. if you try to withdraw a negative value savingAcc.withdraw(-
1000);

Note: SavingAccount
 |-- long id
 |-- double balance
 |--double withdraw(double amount)
 |--double deposit(double amount) 
 */
import java.util.Scanner;
		
import javax.naming.InsufficientResourcesException;

	class  SavingAccount {
		double balance=5000;
		double deposit(double amount) {
			balance=balance+amount;
			return balance;
		}
		double withdraw(double amount) throws InsufficientBalanceException,IllegalBankTransactionException{
			if(amount<=balance&&amount>0)
				System.out.println("Your remaining balance is "+(balance-amount));
			else if(amount>=0){
				 throw new InsufficientBalanceException("Balance is insufficient for further process");
			}
			else {
				throw new IllegalBankTransactionException("Amount given is negative");
			}
			return 0;
		}

		
	}
	public class ExceptionAssignment3 {

		public static void main(String[] args) {
//			@SuppressWarnings("resource")
			Scanner paisa=new Scanner(System.in);
			SavingAccount SA=new SavingAccount();
			System.out.println("1.- Press 1 for Balance Checking :-");
			System.out.println("2.-Press 2 for Deposit Money in Account :-");
			System.out.println("3.- Press 3 for Withdraw Amount from Account :-");
			System.out.print("Enter your Choice 1,2,3 :--");
			int a=paisa.nextInt();
			if(a==1)
			{
				System.out.println("Your current balance is = "+SA.deposit(1));
			}
			else if(a==2)
			{
				System.out.println("Enter the Amount you want to  Deposit in your Account:-");
				double amt=paisa.nextDouble();
				System.out.println("You new Balance is ="+SA.deposit(amt));
			}
			else if(a==3)
			{
				System.out.print("Enter the Amount you want to  Withdraw:-");
				double amt=paisa.nextDouble();
				
				try {
				SA.withdraw(amt);
				}catch(InsufficientBalanceException ex)
				{
					System.out.println("InsufficientBalanceException occur so first resolve it "+ex);
				}catch(IllegalBankTransactionException ex)
				{
					System.out.println("IllegalBankTransactionException occur so first resolve it "+ex);
				}
				
			}
			else {
				System.out.println("Wrong key pressed");
			}			
		}
	}

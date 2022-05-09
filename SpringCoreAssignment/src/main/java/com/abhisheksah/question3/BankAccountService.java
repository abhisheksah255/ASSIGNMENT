package com.abhisheksah.question3;

public interface BankAccountService {

	public double withdraw(long accountId,double balance);
	public double deposit(long accountId,double balace);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount,long toAccount,double amount);
}

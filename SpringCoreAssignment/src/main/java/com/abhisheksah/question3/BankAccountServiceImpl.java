package com.abhisheksah.question3;

import org.springframework.beans.factory.annotation.Autowired;

public class BankAccountServiceImpl implements BankAccountService{

	@Autowired
	BankAccountRepositoryImpl bankAccountRepositoryImpl;
	
	public double withdraw(long accountId, double balance) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double deposit(long accountId, double balace) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

}

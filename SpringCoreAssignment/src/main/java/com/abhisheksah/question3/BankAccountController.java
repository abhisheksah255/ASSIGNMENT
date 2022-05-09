package com.abhisheksah.question3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BankAccountController implements ApplicationContextAware {
	@Autowired
	private ApplicationContextAware applicationContextAware;
	private ApplicationContext context;

	public double withdraw(long accountId,double balance) {
		double newBalance = 0;
		BankAccountRepositoryImpl acc = (BankAccountRepositoryImpl) context.getBean("repository");
		if (acc.getBalance(accountId) >= balance)
			newBalance = acc.getBalance(accountId) - balance;
		acc.updateBalance(accountId, newBalance);
		return newBalance;
	}

	public double deposit(long accountId,double balace) {
		BankAccountRepositoryImpl acc = (BankAccountRepositoryImpl) context.getBean("repository");
		double Newbalance = acc.getBalance(accountId) + balace;
		return acc.updateBalance(accountId, Newbalance);
	}

	
	public double getBalance(long accountId) {
		BankAccountRepositoryImpl bal = (BankAccountRepositoryImpl) context.getBean("repository");
		return bal.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount,long toAccount,double amount) {
		BankAccountRepositoryImpl accountepositoryImpl = (BankAccountRepositoryImpl) context.getBean("repository");
		if (accountepositoryImpl.getBalance(fromAccount) >= amount) {
			double updatedAmt = amount + accountepositoryImpl.getBalance(toAccount);

			accountepositoryImpl.updateBalance(fromAccount, accountepositoryImpl.getBalance(fromAccount) - amount);
			accountepositoryImpl.updateBalance(toAccount, updatedAmt);
			return true;
		}
		return false;
	}
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.context = applicationContext;
	}

	
	
}

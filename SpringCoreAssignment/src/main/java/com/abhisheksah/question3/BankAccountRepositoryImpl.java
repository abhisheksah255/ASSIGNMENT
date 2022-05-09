package com.abhisheksah.question3;

public class BankAccountRepositoryImpl implements BankAccountRepository{
	private BankingAccount Ac1;
	private BankingAccount Ac2;

	public void BankAccountepositoryImpl() {
	}

	
	public BankAccountRepositoryImpl(BankingAccount ac1, BankingAccount ac2) {
		super();
		this.Ac1 = Ac1;
		this.Ac2 = Ac2;
	}


	public double getBalance(long accountId) {
		if(Ac1.getAccountId()==accountId) {
		return Ac1.getAccountBalance();
	}
		return Ac2.getAccountBalance();	
	}

	public double updateBalance(long accountId, double newBalance) {
double updateBalance=0;
updateBalance=newBalance;
if(Ac1.getAccountId()==accountId) {
	
	Ac1.setAccountBalance(updateBalance);
}else {
	Ac2.setAccountBalance(updateBalance);
}
		return updateBalance;
	}

}

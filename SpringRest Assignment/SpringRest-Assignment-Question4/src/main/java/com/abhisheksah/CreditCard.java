package com.abhisheksah;

public class CreditCard {
	private long CreditCardNumber;
	private String isvalid;
	private String CardName;
	
	public CreditCard(long creditCardNumber, String isvalid, String cardName) {
		super();
		CreditCardNumber = creditCardNumber;
		this.isvalid = isvalid;
		CardName = cardName;
	}

	public long getCreditCardNumber() {
		return CreditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		CreditCardNumber = creditCardNumber;
	}

	public String getIsvalid() {
		return isvalid;
	}

	public void setIsvalid(String isvalid) {
		this.isvalid = isvalid;
	}

	public String getCardName() {
		return CardName;
	}

	public void setCardName(String cardName) {
		CardName = cardName;
	}

	@Override
	public String toString() {
		return "CreditCard [CreditCardNumber=" + CreditCardNumber + ", isvalid=" + isvalid + ", CardName=" + CardName
				+ "]";
	}
	
	

}

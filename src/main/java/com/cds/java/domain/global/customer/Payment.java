package com.cds.java.domain.global.customer;

public class Payment {

	BillingInformation billingInformation;
	
	String creditCardType;
	String creditCardNumber;
	String creditCardExpireMonth;
	String creditCardExpireYear;
	String lastCreditCardChargeStatus;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Payment [billingInformation=").append(billingInformation).append(", creditCardType=")
				.append(creditCardType).append(", creditCardNumber=").append(creditCardNumber)
				.append(", creditCardExpireMonth=").append(creditCardExpireMonth).append(", creditCardExpireYear=")
				.append(creditCardExpireYear).append(", lastCreditCardChargeStatus=").append(lastCreditCardChargeStatus)
				.append("]");
		return builder.toString();
	}
}

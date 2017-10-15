package com.cds.java.domain.global.customer;

public class CardProfile {

	String cardProfileId;
	String defaultCardProfile;
	String creditCardType;
	String creditCardNumber;
	String creditCardExpireMonth;
	String creditCardExpireYear;
	String name;
	String accountNumber;
	String token;
	String ccEmail;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CardProfile [cardProfileId=").append(cardProfileId).append(", defaultCardProfile=")
				.append(defaultCardProfile).append(", creditCardType=").append(creditCardType)
				.append(", creditCardNumber=").append(creditCardNumber).append(", creditCardExpireMonth=")
				.append(creditCardExpireMonth).append(", creditCardExpireYear=").append(creditCardExpireYear)
				.append(", name=").append(name).append(", accountNumber=").append(accountNumber).append(", token=")
				.append(token).append(", ccEmail=").append(ccEmail).append("]");
		return builder.toString();
	}
	
}

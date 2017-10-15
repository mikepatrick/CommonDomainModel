package com.cds.java.domain.global.customer;

public class WalletAccount {

	String token;
	String accountType;
	String creditCardExpire;
	String creditCardExpireMonth;
	String creditCardExpireYear;
	String name;
	String addressLine1;
	String city;
	String state;
	String postalCode;
	String country;
	String preferenceCode;
	String creditCardLastFour;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WalletAccount [token=").append(token).append(", accountType=").append(accountType)
				.append(", creditCardExpire=").append(creditCardExpire).append(", creditCardExpireMonth=")
				.append(creditCardExpireMonth).append(", creditCardExpireYear=").append(creditCardExpireYear)
				.append(", name=").append(name).append(", addressLine1=").append(addressLine1).append(", city=")
				.append(city).append(", state=").append(state).append(", postalCode=").append(postalCode)
				.append(", country=").append(country).append(", preferenceCode=").append(preferenceCode)
				.append(", creditCardLastFour=").append(creditCardLastFour).append("]");
		return builder.toString();
	}
}

package com.cds.java.domain.global.customer;

public class OrderItem {

	String orderNumber;
	String orderTypeCode;
	String orderTypeCodeDescription;
	String subscriptionTerm;
	
	Recipient recipient;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderItem [orderNumber=").append(orderNumber).append(", orderTypeCode=").append(orderTypeCode)
				.append(", orderTypeCodeDescription=").append(orderTypeCodeDescription).append(", subscriptionTerm=")
				.append(subscriptionTerm).append(", recipient=").append(recipient).append("]");
		return builder.toString();
	}
	
}

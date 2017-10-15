package com.cds.java.domain.global.customer;

public class GlobalCustomerResponse {

	String isSuccess;
	String transactionId;
	String transactionDesc;
	String systemName;
	String prodId;
	String Message;
	
	GlobalCustomer globalcustomer;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GlobalCustomerResponse [isSuccess=").append(isSuccess).append(", transactionId=")
				.append(transactionId).append(", transactionDesc=").append(transactionDesc).append(", systemName=")
				.append(systemName).append(", prodId=").append(prodId).append(", Message=").append(Message)
				.append(", globalcustomer=").append(globalcustomer).append("]");
		return builder.toString();
	}
	
	
}

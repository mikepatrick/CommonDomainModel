package com.cds.java.domain.global.customer;

import java.util.List;

import com.cds.java.domain.recreg.RecRegResponse;

public class GlobalCustomer {

	RecRegResponse recReg;
	Wallet wallet;
	List<Customer> customers;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GlobalCustomer [recReg=").append(recReg).append(", wallet=").append(wallet)
				.append(", customers=").append(customers).append("]");
		return builder.toString();
	}
}

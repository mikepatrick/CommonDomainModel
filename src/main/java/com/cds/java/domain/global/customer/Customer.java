package com.cds.java.domain.global.customer;

import java.util.List;

public class Customer {

	String accountNumber;
	String firstName;
	String lastName;
	String middleName;
	String prefix;
	String suffix;
	String address1;
	String address2;
	String city;
	String state;
	String zipCode;
	String country;
	String email;
		
	String username;
	String password;
	String phoneNumber;
	String faxNumber;
	
	String department;
	
	String companyName;
	String jobTitle;
	String storeCreditBalance;
	String customerSince;
	String prodIdAlias;
	String prodId;
	
	String serviceStatus;
	String serviceStatusDescription;
	String baseCreditStatus;
	String baseCreditStatusDescription;
	String numberOfCopies;
	String startIssue;
	String startIssueDescription;
	String startIssueCoverDate;
	String expireIssue;
	String expireIssueDescription;
	String expireIssueCoverDate;
	String lastIssue;
	String lastIssueDescription;
	String lastIssueCoverDate;
	String resumeIssueCoverDate;
	String remainingIssues;
	String specialProductCode;
	String promotionKey;
	String giftPromotionKey;
	String historyOrders;
	String historyEmails;
	String historyNames;
	String customerStatus;
	String customerStatusDescription;
	String productIndicator;
	String productIndicator2;
	String listRentalSwitch;
	String timesRenewed;
	String numberExtensionIssues;
	String addressFromDate;
	String emailLocation;
	String demographicsAvailable;
	String resumeIssue;
	
	
	
	Permissions permissions;
	
	List<Order> orders;
	
	MultiMag multiMag;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [accountNumber=").append(accountNumber).append(", firstName=").append(firstName)
				.append(", lastName=").append(lastName).append(", middleName=").append(middleName).append(", prefix=")
				.append(prefix).append(", suffix=").append(suffix).append(", address1=").append(address1)
				.append(", address2=").append(address2).append(", city=").append(city).append(", state=").append(state)
				.append(", zipCode=").append(zipCode).append(", country=").append(country).append(", email=")
				.append(email).append(", username=").append(username).append(", password=").append(password)
				.append(", phoneNumber=").append(phoneNumber).append(", faxNumber=").append(faxNumber)
				.append(", department=").append(department).append(", companyName=").append(companyName)
				.append(", jobTitle=").append(jobTitle).append(", storeCreditBalance=").append(storeCreditBalance)
				.append(", customerSince=").append(customerSince).append(", prodIdAlias=").append(prodIdAlias)
				.append(", prodId=").append(prodId).append(", serviceStatus=").append(serviceStatus)
				.append(", serviceStatusDescription=").append(serviceStatusDescription).append(", baseCreditStatus=")
				.append(baseCreditStatus).append(", baseCreditStatusDescription=").append(baseCreditStatusDescription)
				.append(", numberOfCopies=").append(numberOfCopies).append(", startIssue=").append(startIssue)
				.append(", startIssueDescription=").append(startIssueDescription).append(", startIssueCoverDate=")
				.append(startIssueCoverDate).append(", expireIssue=").append(expireIssue)
				.append(", expireIssueDescription=").append(expireIssueDescription).append(", expireIssueCoverDate=")
				.append(expireIssueCoverDate).append(", lastIssue=").append(lastIssue).append(", lastIssueDescription=")
				.append(lastIssueDescription).append(", lastIssueCoverDate=").append(lastIssueCoverDate)
				.append(", resumeIssueCoverDate=").append(resumeIssueCoverDate).append(", remainingIssues=")
				.append(remainingIssues).append(", specialProductCode=").append(specialProductCode)
				.append(", promotionKey=").append(promotionKey).append(", giftPromotionKey=").append(giftPromotionKey)
				.append(", historyOrders=").append(historyOrders).append(", historyEmails=").append(historyEmails)
				.append(", historyNames=").append(historyNames).append(", customerStatus=").append(customerStatus)
				.append(", customerStatusDescription=").append(customerStatusDescription).append(", productIndicator=")
				.append(productIndicator).append(", productIndicator2=").append(productIndicator2)
				.append(", listRentalSwitch=").append(listRentalSwitch).append(", timesRenewed=").append(timesRenewed)
				.append(", numberExtensionIssues=").append(numberExtensionIssues).append(", addressFromDate=")
				.append(addressFromDate).append(", emailLocation=").append(emailLocation)
				.append(", demographicsAvailable=").append(demographicsAvailable).append(", resumeIssue=")
				.append(resumeIssue).append(", permissions=").append(permissions).append(", orders=").append(orders)
				.append(", multiMag=").append(multiMag).append("]");
		return builder.toString();
	}
	
	
}

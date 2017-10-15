package com.cds.java.domain.global.customer;

public class MultiMag {

	String magAbbreviation;
	String nonGiftAmountDue;
	String giftAmountDue;
	String autoRenewal;
	String serviceStatus;
	String serviceStatusDescription;
	String expireIssue;
	String expireIssueDescription;
	String expireIssueCoverDate;
	String expireIssueCover;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MultiMag [magAbbreviation=").append(magAbbreviation).append(", nonGiftAmountDue=")
				.append(nonGiftAmountDue).append(", giftAmountDue=").append(giftAmountDue).append(", autoRenewal=")
				.append(autoRenewal).append(", serviceStatus=").append(serviceStatus)
				.append(", serviceStatusDescription=").append(serviceStatusDescription).append(", expireIssue=")
				.append(expireIssue).append(", expireIssueDescription=").append(expireIssueDescription)
				.append(", expireIssueCoverDate=").append(expireIssueCoverDate).append(", expireIssueCover=")
				.append(expireIssueCover).append("]");
		return builder.toString();
	}
}

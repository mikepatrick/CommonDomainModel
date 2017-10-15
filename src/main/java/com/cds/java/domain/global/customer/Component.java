package com.cds.java.domain.global.customer;

public class Component {

	String prodId;
	String prodIdAlias;
	String productName;
	String orderNumber;
	String status;
	String statusDescription;
	String trackingCode;
	String lastPaymentAmount;
	String lastPaymentDate;
	String nextPaymentAmount;
	String nextPaymentDate;
	String createdDate;
	String remainingValue;
	String orderValue;
	String originalStartDate;
	String subscriptionStart;
	String subscriptionExpire;
	String subscriptionEnd;
	String inTrial;
	String autoRenew;
	String periodUnit;
	String productNumber;
	String storeCreditUsed;
	String settlementDate;
	
	String servSubscriptionTerm;
	String servMagAbbr;
	String servReconciliationKey;
	String servAccountNumber;
	String servOrderNumber;
	String managedBy;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Component [prodId=").append(prodId).append(", prodIdAlias=").append(prodIdAlias)
				.append(", productName=").append(productName).append(", orderNumber=").append(orderNumber)
				.append(", status=").append(status).append(", statusDescription=").append(statusDescription)
				.append(", trackingCode=").append(trackingCode).append(", lastPaymentAmount=").append(lastPaymentAmount)
				.append(", lastPaymentDate=").append(lastPaymentDate).append(", nextPaymentAmount=")
				.append(nextPaymentAmount).append(", nextPaymentDate=").append(nextPaymentDate).append(", createdDate=")
				.append(createdDate).append(", remainingValue=").append(remainingValue).append(", orderValue=")
				.append(orderValue).append(", originalStartDate=").append(originalStartDate)
				.append(", subscriptionStart=").append(subscriptionStart).append(", subscriptionExpire=")
				.append(subscriptionExpire).append(", subscriptionEnd=").append(subscriptionEnd).append(", inTrial=")
				.append(inTrial).append(", autoRenew=").append(autoRenew).append(", periodUnit=").append(periodUnit)
				.append(", productNumber=").append(productNumber).append(", storeCreditUsed=").append(storeCreditUsed)
				.append(", settlementDate=").append(settlementDate).append(", servSubscriptionTerm=")
				.append(servSubscriptionTerm).append(", servMagAbbr=").append(servMagAbbr)
				.append(", servReconciliationKey=").append(servReconciliationKey).append(", servAccountNumber=")
				.append(servAccountNumber).append(", servOrderNumber=").append(servOrderNumber).append(", managedBy=")
				.append(managedBy).append("]");
		return builder.toString();
	}
	
	
	
}

package com.cds.java.domain.global.customer;

import java.util.List;

public class Order {

	//eHub
	String orderNumber;
	String createdDate;
	String reasonCode;
	String packageName;
	
	List<Component> components;
	
	CardProfile cardProfile;
	
	String amendment;
	String packageOfferCode;
	String packageOfferId;
	String packageSetId;
	String packagePrice;
	String packageRenewalNotificationSent;
	String packageFrequency;
	String packageSettlementDate;
	String digital;
	String customer;
	
	Payment payment;
	
	// SERV
	String promotionKey;
	String sourceCode;
	String sourceCodeDescription;
	String mediumCode;
	String mediumCodeDescription;
	String taxExemptCode;
	String specialInfo;
	String amountDue;
	String subscriptionStart;
	String subscriptionStartDescription;
	String subscriptionStartCoverDate;
	String subscriptionExpireCoverDate;
	String subscriptionExpireDescription;
	String vendorTransactionId;
	String vendorCode;
	String oldBillKey;
	String productName;
	String cancel;
	String prodId;
	String prodIdAlias;
	String orderValue;
	String status;
	String statusDescription;
	String lastPaymentDate;
	String lastPaymentAmount;
	String subscriptionExpire;
	String creditStatus;
	String creditStatusDescription;
	String orderEntry;
	String orderEntryDescription;
	String setCode;
	String setCodeDescription;
	String agencyCode;
	String agencyGross;
	String currencyCode;
	String currencyValue;
	String magazineCategory;
	String newRenewCode;
	String newRenewCodeDesc;
	String taxValue;
	String orderInd1;
	String orderInd2;
	String employeeId;
	String subscriptionOrder;
	String premiumSwitch;
	String orderOrigin;
	OrderItem orderItem;
	
	Donor donor;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [orderNumber=").append(orderNumber).append(", createdDate=").append(createdDate)
				.append(", reasonCode=").append(reasonCode).append(", packageName=").append(packageName)
				.append(", cardProfile=").append(cardProfile).append(", amendment=").append(amendment)
				.append(", packageOfferCode=").append(packageOfferCode).append(", packageOfferId=")
				.append(packageOfferId).append(", packageSetId=").append(packageSetId).append(", packagePrice=")
				.append(packagePrice).append(", packageRenewalNotificationSent=").append(packageRenewalNotificationSent)
				.append(", packageFrequency=").append(packageFrequency).append(", packageSettlementDate=")
				.append(packageSettlementDate).append(", digital=").append(digital).append(", customer=")
				.append(customer).append(", payment=").append(payment).append(", promotionKey=").append(promotionKey)
				.append(", sourceCode=").append(sourceCode).append(", sourceCodeDescription=")
				.append(sourceCodeDescription).append(", mediumCode=").append(mediumCode)
				.append(", mediumCodeDescription=").append(mediumCodeDescription).append(", taxExemptCode=")
				.append(taxExemptCode).append(", specialInfo=").append(specialInfo).append(", amountDue=")
				.append(amountDue).append(", subscriptionStart=").append(subscriptionStart)
				.append(", subscriptionStartDescription=").append(subscriptionStartDescription)
				.append(", subscriptionStartCoverDate=").append(subscriptionStartCoverDate)
				.append(", subscriptionExpireCoverDate=").append(subscriptionExpireCoverDate)
				.append(", subscriptionExpireDescription=").append(subscriptionExpireDescription)
				.append(", vendorTransactionId=").append(vendorTransactionId).append(", vendorCode=").append(vendorCode)
				.append(", oldBillKey=").append(oldBillKey).append(", productName=").append(productName)
				.append(", cancel=").append(cancel).append(", prodId=").append(prodId).append(", prodIdAlias=")
				.append(prodIdAlias).append(", orderValue=").append(orderValue).append(", status=").append(status)
				.append(", statusDescription=").append(statusDescription).append(", lastPaymentDate=")
				.append(lastPaymentDate).append(", lastPaymentAmount=").append(lastPaymentAmount)
				.append(", subscriptionExpire=").append(subscriptionExpire).append(", creditStatus=")
				.append(creditStatus).append(", creditStatusDescription=").append(creditStatusDescription)
				.append(", orderEntry=").append(orderEntry).append(", orderEntryDescription=")
				.append(orderEntryDescription).append(", setCode=").append(setCode).append(", setCodeDescription=")
				.append(setCodeDescription).append(", agencyCode=").append(agencyCode).append(", agencyGross=")
				.append(agencyGross).append(", currencyCode=").append(currencyCode).append(", currencyValue=")
				.append(currencyValue).append(", magazineCategory=").append(magazineCategory).append(", newRenewCode=")
				.append(newRenewCode).append(", newRenewCodeDesc=").append(newRenewCodeDesc).append(", taxValue=")
				.append(taxValue).append(", orderInd1=").append(orderInd1).append(", orderInd2=").append(orderInd2)
				.append(", employeeId=").append(employeeId).append(", subscriptionOrder=").append(subscriptionOrder)
				.append(", premiumSwitch=").append(premiumSwitch).append(", orderOrigin=").append(orderOrigin)
				.append(", orderItem=").append(orderItem).append(", donor=").append(donor).append("]");
		return builder.toString();
	}
	
}

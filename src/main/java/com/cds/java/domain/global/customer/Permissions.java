package com.cds.java.domain.global.customer;

public class Permissions {

	String emailAuthorization;
	
	String allowGiftAutoRenewal;
	String emailUseAnywherePerm;
	String allowPromoteAsRecipient;
	String allowSweepsPromotions;
	String allowRegularPromotions;
	String allowPhone;
	String emailActivePerm;
	String allowContestPromotions;
	String emailUseForCompanyPerm;
	String allowSingleAutoRenewal;
	String allowGiftPromotions;
	String emailPermission0;
	String emailPermission1;
	String emailPermission2;
	String emailPermission3;
	String emailPermission4;
	String emailPermission5;
	String emailPermission6;
	String emailPermission7;
	String emailPermission8;
	String emailPermission9;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Permissions [emailAuthorization=").append(emailAuthorization).append(", allowGiftAutoRenewal=")
				.append(allowGiftAutoRenewal).append(", emailUseAnywherePerm=").append(emailUseAnywherePerm)
				.append(", allowPromoteAsRecipient=").append(allowPromoteAsRecipient).append(", allowSweepsPromotions=")
				.append(allowSweepsPromotions).append(", allowRegularPromotions=").append(allowRegularPromotions)
				.append(", allowPhone=").append(allowPhone).append(", emailActivePerm=").append(emailActivePerm)
				.append(", allowContestPromotions=").append(allowContestPromotions).append(", emailUseForCompanyPerm=")
				.append(emailUseForCompanyPerm).append(", allowSingleAutoRenewal=").append(allowSingleAutoRenewal)
				.append(", allowGiftPromotions=").append(allowGiftPromotions).append(", emailPermission0=")
				.append(emailPermission0).append(", emailPermission1=").append(emailPermission1)
				.append(", emailPermission2=").append(emailPermission2).append(", emailPermission3=")
				.append(emailPermission3).append(", emailPermission4=").append(emailPermission4)
				.append(", emailPermission5=").append(emailPermission5).append(", emailPermission6=")
				.append(emailPermission6).append(", emailPermission7=").append(emailPermission7)
				.append(", emailPermission8=").append(emailPermission8).append(", emailPermission9=")
				.append(emailPermission9).append("]");
		return builder.toString();
	}
}

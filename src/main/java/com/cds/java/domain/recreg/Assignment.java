package com.cds.java.domain.recreg;

import java.util.ArrayList;
import java.util.List;

class Assignment {
	
	private String globalCode;
	private String systemCode;
	private String productCode;
	private String accountCode;
	private String virtualDelete;
	private String isActive;
	
	private List<AssignmentDates> dateList;
	
	public Assignment() {
		dateList = new ArrayList<AssignmentDates>();
	}

	public String getGlobalCode() {
		return globalCode;
	}

	public void setGlobalCode(String globalCode) {
		this.globalCode = globalCode;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getVirtualDelete() {
		return virtualDelete;
	}

	public void setVirtualDelete(String virtualDelete) {
		this.virtualDelete = virtualDelete;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public List<AssignmentDates> getDateList() {
		return dateList;
	}

	public void setDateList(List<AssignmentDates> dateList) {
		this.dateList = dateList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Assignment [globalCode=").append(globalCode).append(", systemCode=").append(systemCode)
				.append(", productCode=").append(productCode).append(", accountCode=").append(accountCode)
				.append(", virtualDelete=").append(virtualDelete).append(", isActive=").append(isActive)
				.append(", dateList=").append(dateList).append("]");
		return builder.toString();
	}
}

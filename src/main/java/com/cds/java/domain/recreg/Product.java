package com.cds.java.domain.recreg;

class Product {

	private String systemCode;
	private String productCode;
	private String accountCode;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [systemCode=").append(systemCode).append(", productCode=").append(productCode)
				.append(", accountCode=").append(accountCode).append("]");
		return builder.toString();
	}
		
}

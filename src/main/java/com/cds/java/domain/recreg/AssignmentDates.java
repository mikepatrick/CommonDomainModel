package com.cds.java.domain.recreg;

import java.util.Date;

class AssignmentDates {

	private Date fromDate;
	private Date thruDate;
	private Address originalAddress;
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getThruDate() {
		return thruDate;
	}
	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
	}
	public Address getOriginalAddress() {
		return originalAddress;
	}
	public void setOriginalAddress(Address originalAddress) {
		this.originalAddress = originalAddress;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AssignmentDates [fromDate=").append(fromDate).append(", thruDate=").append(thruDate)
				.append(", originalAddress=").append(originalAddress).append("]");
		return builder.toString();
	}
	
	
}

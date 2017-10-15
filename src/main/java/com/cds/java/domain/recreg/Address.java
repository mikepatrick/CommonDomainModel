package com.cds.java.domain.recreg;

import java.util.ArrayList;
import java.util.List;

class Address {

	private String firstName;
	private String lastName;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String postalCode;
	private String region;
	private String countryCode;
	private List<Assignment> assignmentList;
	
	public Address() {
		assignmentList = new ArrayList<Assignment>();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public List<Assignment> getAssignmentList() {
		return assignmentList;
	}

	public void setAssignmentList(List<Assignment> assignmentList) {
		this.assignmentList = assignmentList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [firstName=").append(firstName).append(", lastName=").append(lastName)
				.append(", addressLine1=").append(addressLine1).append(", addressLine2=").append(addressLine2)
				.append(", city=").append(city).append(", postalCode=").append(postalCode).append(", region=")
				.append(region).append(", countryCode=").append(countryCode).append(", assignmentList=")
				.append(assignmentList).append("]");
		return builder.toString();
	}
	
}

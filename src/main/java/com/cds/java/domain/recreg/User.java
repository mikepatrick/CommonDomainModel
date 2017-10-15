package com.cds.java.domain.recreg;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Integer id;
	private List<Product> productList;
	private List<Address> addressList;
	private List<Email> emailList;
	
	public User() {
		id = 0;
		productList = new ArrayList<Product>();
		addressList = new ArrayList<Address>();
		emailList = new ArrayList<Email>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	public List<Email> getEmailList() {
		return emailList;
	}

	public void setEmailList(List<Email> emailList) {
		this.emailList = emailList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=").append(id).append(", productList=").append(productList).append(", addressList=")
				.append(addressList).append(", emailList=").append(emailList).append("]");
		return builder.toString();
	}
	
}

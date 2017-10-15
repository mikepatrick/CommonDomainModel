package com.cds.java.domain.recreg;

import java.util.List;

public class RecRegResponse {

	private String result;

	private ReturnCounts returnCounts;
	
	//Data data;
	private List<User> userList;
	
	public RecRegResponse() {
		//data = new Data()
		result = "";
		returnCounts = new ReturnCounts();
		returnCounts.actualCount = 0;
		returnCounts.totalCount = 0;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public ReturnCounts getReturnCounts() {
		return returnCounts;
	}

	public void setReturnCounts(ReturnCounts returnCounts) {
		this.returnCounts = returnCounts;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	
}

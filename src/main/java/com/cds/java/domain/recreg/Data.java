package com.cds.java.domain.recreg;

import java.util.List;

class Data {
	
	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Data [userList=").append(userList).append("]");
		return builder.toString();
	}
	
}

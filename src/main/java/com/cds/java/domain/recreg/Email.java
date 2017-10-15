package com.cds.java.domain.recreg;

import java.util.ArrayList;
import java.util.List;

class Email {
	
	private String emailAddress;
	private String username;
	private String password;
	private List<Assignment> assignmentList;
	
	public Email() {
		assignmentList = new ArrayList<Assignment>();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		builder.append("Email [emailAddress=").append(emailAddress).append(", username=").append(username)
				.append(", password=").append(password).append(", assignmentList=").append(assignmentList).append("]");
		return builder.toString();
	}
	
	
}

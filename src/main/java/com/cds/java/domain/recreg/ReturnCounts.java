package com.cds.java.domain.recreg;

class ReturnCounts {
	
	Integer totalCount;
	Integer actualCount;
	
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getActualCount() {
		return actualCount;
	}
	public void setActualCount(Integer actualCount) {
		this.actualCount = actualCount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReturnCounts [totalCount=").append(totalCount).append(", actualCount=").append(actualCount)
				.append("]");
		return builder.toString();
	}
	
}

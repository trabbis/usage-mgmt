package com.telus.bill.repository;

public class BatchInfoTypeVO extends ValueObject {
	private Long batchNumber;
	private boolean moreDataExistInd;
	
	public BatchInfoTypeVO(){
		this(new Long(0));
	}
	
	public BatchInfoTypeVO(Long batchNumber){
    	setBatchNumber(batchNumber);
    	setMoreDataExistInd(false);		
	}
	
	public boolean isMoreDataExistInd() {
		return moreDataExistInd;
	}
	public void setMoreDataExistInd(boolean moreDataExistInd) {
		this.moreDataExistInd = moreDataExistInd;
	}
	public Long getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(Long batchNumber) {
		this.batchNumber = batchNumber;
	}
}

package com.telus.bill.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class RawUsageListResponseVO extends ValueObject {
	
	private static final long serialVersionUID = 1L;
	
	private BatchInfoTypeVO batchInfoTypeVO;
	private List<DataServiceEventVO> rawUsageList;
	
	public RawUsageListResponseVO(Long batchNumber){
		batchInfoTypeVO = new BatchInfoTypeVO(batchNumber);
	}	
	
	public BatchInfoTypeVO getBatchInfoTypeVO() {
		return batchInfoTypeVO;
	}	
	public void setBatchInfoTypeVO(BatchInfoTypeVO batchInfoType) {
		this.batchInfoTypeVO = batchInfoType;
	}
	public List<DataServiceEventVO> getRawUsageList() {
		return rawUsageList;
	}
	public void setRawUsageList(List<DataServiceEventVO> rawUsageList) {
		this.rawUsageList = rawUsageList;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		
		if(rawUsageList!=null){
			Iterator<DataServiceEventVO> iterator = rawUsageList.iterator();
			while(iterator.hasNext()){
				DataServiceEventVO item = iterator.next();
				buffer.append(item.toString());
				buffer.append(" || ");
			}
		}
		
		return buffer.toString();
	}
	
	
}

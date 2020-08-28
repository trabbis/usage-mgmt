package com.telus.usage.mgmt.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.telus.usage.mgmt.beans.BatchInfoTypeVO;
import com.telus.usage.mgmt.beans.DataServiceEventVO;
import com.telus.usage.mgmt.beans.RawUsageListResponseVO;
import com.telus.usage.mgmt.beans.SearchRawUsageListVO;
import com.telus.usage.mgmt.exceptions.ConvertorException;
import com.telus.usage.mgmt.response.BatchInfoType;
import com.telus.usage.mgmt.response.RawUsageListResponse;
import com.telus.usage.mgmt.response.beans.DataServiceEvent;


public class Convertor {


	//TODO2
	public static RawUsageListResponse convert(RawUsageListResponseVO item) throws ConvertorException {
		RawUsageListResponse result = new RawUsageListResponse();
		
		try{
			if(item!=null){

				result.setBatchInfoType(convert(item.getBatchInfoTypeVO(), true, true));
				result.setRawUsageListType(convertDataServiceEvents(item.getRawUsageList()));				
			}
		}
		catch(RuntimeException e){
			throw new ConvertorException("Conversion has problem", e);
		}
		
		return result;
	}
	
	private static DataServiceEvent[] convertDataServiceEvents(List<DataServiceEventVO> items) {
		DataServiceEvent[] result = null;
		
			if(items!=null){
				result=new DataServiceEvent[items.size()];
				
				for (int i=0; i<items.size(); i++) {
					result[i] = convert(items.get(i));
				}			
			}			
//			try{
//		}
//		catch(ConvertorException e){
//			throw new Exception(e);
//		}
							
		return result == null ? new DataServiceEvent[]{} : result;		
	}
	
	public static BatchInfoType convert(BatchInfoTypeVO item, boolean alfa, boolean beta) {

		BatchInfoType result = new BatchInfoType();
		
			if(item!=null){
				result.setBatchNumber(convert(item.getBatchNumber()));
				result.setMoreDataExistInd(item.isMoreDataExistInd());
			}
//			try{
//		}
//		catch(Exception e){
//			throw new Exception(e);
//		}
			
		
		return result;
	}
	
	public static BigInteger convert(Long item) {
		BigInteger result = null;
		if(item!=null){
			result = BigInteger.valueOf(item);
		}
		
		return result;
	}
	
	
	
	private static DataServiceEvent convert(DataServiceEventVO item) {
		DataServiceEvent result = new DataServiceEvent();
		
			if(item!=null){
				item = null;
				result.setChargingId(item.getChargingId());
				result.setContentDeliveredInd(item.getContentDeliveredInd());
				result.setContentDownloadByteQuantity(item.getContentDownloadByteQuantity());
				result.setDeviceDownloadGBQuantity(item.getDeviceDownloadGBQuantity());
				result.setContentSizeQuantity(item.getContentSizeQuantity());
				result.setContentUploadByteQuantity(item.getContentUploadByteQuantity());
				result.setDeviceUploadGBQuantity(item.getDeviceUploadGBQuantity());
				result.setDataServiceEventId(item.getDataServiceEventId()==null?-1:item.getDataServiceEventId());
//TODO2				result.setDataServiceEventTime(convert(item.getDataServiceEventTime()));
				result.setDataServiceEventTypeCd(item.getDataServiceEventTypeCd());
				result.setDeviceDownloadByteQuantity(item.getDeviceDownloadByteQuantity());
				result.setDeviceUploadByteQuantity(item.getDeviceUploadByteQuantity());
				result.setBillablePhoneNum(item.getPhoneNumber());
				result.setHostDomainName(item.getHostDomainName());
				result.setImsiNum(item.getImsiNum());
				result.setMccMncCd(item.getMccMncCd());
				result.setMediationTransactionId(item.getMediationTransactionId()==null?-1:item.getMediationTransactionId());
				result.setMinNum(item.getMinNum());
				result.setNasIpString(item.getNasIpString());
				result.setNetworkFileId(item.getNetworkFileId()==null?-1:item.getNetworkFileId());
//TODO2				result.setRawDataUsageDetail(convert(item.getRawDataUsageDetail()));				
				result.setRecordDuplicateCheckNum(item.getRecordDuplicateCheckNum());
				
				result.setRecordId(item.getRecordId());
				
				result.setRecordTypeCd(item.getRecordTypeCd()); 
				result.setRequestedURLString(item.getRequestedURLString());
				result.setServiceBidId(item.getServiceBidId());
				result.setServiceDurationSecQuantity(item.getServiceDurationSecQuantity());
				result.setServiceTechnolgyCd(item.getServiceTechnolgyCd());
				result.setServingNetworkString(item.getServingNetworkString());
				result.setServingSidId(item.getServingSidId());
				result.setSessionDomainName(item.getSessionDomainName());
				result.setSGSNAddressString(item.getSGSNAddressString());
				result.setSourceNetworkCd(item.getSourceNetworkCd());
				result.setStatusRequestCd(item.getStatusRequestCd());
				result.setStatusResponseCd(item.getStatusResponseCd());
				result.setSubSidId(item.getSubSidId());
				result.setUserLoginText(item.getUserLoginText());		
				
	    		result.setAccessPointNameNetworkString(item.getAccessPointNameNetworkString());
	    		result.setAccountingPlanName(item.getAccountingPlanName());
	    		result.setArtistName(item.getArtistName());
	    		result.setCellSiteId(item.getCellSiteId());
	    		result.setChargingCharacterCd(item.getChargingCharacterCd());
	    		result.setChargingGatewayFunctionServiceId(item.getChargingGatewayFunctionServiceId());
				
	    		result.setContentURLString(item.getContentURLString());
	    		result.setCreateUserId(item.getCreateUserId());
	    		result.setGenre(item.getGenre());
	    		result.setGGSNAddressString(item.getGGSNAddressString());
	    		result.setImeiNum(item.getImeiNum());
	    		result.setLocationAreaCd(item.getLocationAreaCd());
	    		result.setMocnMccMncCd(item.getMocnMccMncCd());
	    		result.setMultiplexId(item.getMultiplexId());
//TODO2	    		result.setRecordClosingTime(convert(item.getRecordClosingTime()));
	    		result.setRecordSequenceNum(item.getRecordSequenceNum());
	    		result.setServiceAreaCd(item.getServiceAreaCd());
	    		result.setTerminationReasonCd(item.getTerminationReasonCd());
	    		result.setTitleName(item.getTitleName());
	    		
	    		result.setChargingResultCd(item.getChargingResultCd());    		
	    		result.setFurnishChargingCd(item.getFurnishChargingCd());
				result.setLocationAreaCd(item.getLocationAreaCd());
				
//TODO2				result.setCreateTime(convert(item.getCreateTime()));
				
				result.setRadioAccessTechTypeCd(item.getRadioAccessTechTypeCd());
				result.setServedPacketDataProtocolAddressTxt(item.getServedPacketDataProtocolAddressTxt());
				result.setNetworkTypeCd(item.getNetworkTypeCd());
				
				//only when getting raw details
//TODO2				result.setRawDataUsageDetail(convert(item.getRawDataUsageDetail()));
			}			

//		try{
//		}
//		catch(ConvertorException e ){
//			throw new ConvertorException(null, e);
//		}
		
		return result;
		
	}

	
	
}

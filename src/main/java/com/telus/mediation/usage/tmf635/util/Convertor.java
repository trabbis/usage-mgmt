package com.telus.usage.mgmt.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.validation.ValidationException;

import org.apache.commons.lang3.StringUtils;

import com.telus.usage.mgmt.beans.BatchInfoTypeVO;
import com.telus.usage.mgmt.beans.DataServiceEventVO;
import com.telus.usage.mgmt.beans.RawUsageListResponseVO;
import com.telus.usage.mgmt.beans.SearchRawUsageListVO;
import com.telus.usage.mgmt.beans.SearchRawUsageVO;
import com.telus.usage.mgmt.exceptions.ConvertorException;
import com.telus.usage.mgmt.response.BatchInfoType;
import com.telus.usage.mgmt.response.RawUsageListResponse;
import com.telus.usage.mgmt.response.Usage;
import com.telus.usage.mgmt.response.beans.DataServiceEvent;


public class Convertor {

	public static List<Usage> convertTmf635(RawUsageListResponseVO lists) {
		List<Usage> usageList = new ArrayList<Usage>();
		List<DataServiceEventVO> rawUsageList = lists.getRawUsageList();
		for (DataServiceEventVO dataServiceEventVO : rawUsageList) {
			Usage usage = new Usage();
			
			usage.setId(String.valueOf(dataServiceEventVO.getDataServiceEventId()));
			usage.setType("raw");
			usage.setDate(Instant.now().toString());
			
			usage.addUsageCharacteristic("dataServiceEventTime", dataServiceEventVO.getDataServiceEventTime());
			usage.addUsageCharacteristic("dataServiceEventTypeCd", dataServiceEventVO.getDataServiceEventTypeCd());
			usage.addUsageCharacteristic("mediationTransactionId", dataServiceEventVO.getMediationTransactionId());
			usage.addUsageCharacteristic("networkFileId", dataServiceEventVO.getNetworkFileId());
			
			usage.addUsageCharacteristic("sourceNetworkCd", dataServiceEventVO.getSourceNetworkCd());
//			usage.addUsageCharacteristic("billablePhoneNum", dataServiceEventVO.getBillablePhoneNum()); //TODO
			usage.addUsageCharacteristic("imsiNum", dataServiceEventVO.getImsiNum());
			usage.addUsageCharacteristic("minNum", dataServiceEventVO.getMinNum());
			usage.addUsageCharacteristic("imeiNum", dataServiceEventVO.getImeiNum());
			usage.addUsageCharacteristic("servingSidId", dataServiceEventVO.getServingSidId());
			usage.addUsageCharacteristic("serviceBidId", dataServiceEventVO.getServiceBidId());
			
			usage.addUsageCharacteristic("mccMncCd", dataServiceEventVO.getMccMncCd());
			usage.addUsageCharacteristic("mocnMccMncCd", dataServiceEventVO.getMocnMccMncCd());
			usage.addUsageCharacteristic("contentUploadByteQuantity", dataServiceEventVO.getContentUploadByteQuantity());
			usage.addUsageCharacteristic("contentDownloadByteQuantity", dataServiceEventVO.getContentDownloadByteQuantity());
			usage.addUsageCharacteristic("deviceDownloadGBQuantity", dataServiceEventVO.getDeviceDownloadGBQuantity());
			usage.addUsageCharacteristic("deviceUploadGBQuantity", dataServiceEventVO.getDeviceUploadGBQuantity());
			
			usage.addUsageCharacteristic("deviceUploadByteQuantity", dataServiceEventVO.getDeviceUploadByteQuantity());
			usage.addUsageCharacteristic("deviceDownloadByteQuantity", dataServiceEventVO.getDeviceDownloadByteQuantity());
			usage.addUsageCharacteristic("recordId", dataServiceEventVO.getRecordId());
			usage.addUsageCharacteristic("serviceDurationSecQuantity", dataServiceEventVO.getServiceDurationSecQuantity());
			usage.addUsageCharacteristic("chargingGatewayFunctionServiceId", dataServiceEventVO.getChargingGatewayFunctionServiceId());
			usage.addUsageCharacteristic("chargingCharacterCd", dataServiceEventVO.getChargingCharacterCd());
			usage.addUsageCharacteristic("serviceTechnolgyCd", dataServiceEventVO.getServiceTechnolgyCd());
			
			usage.addUsageCharacteristic("userLoginText", dataServiceEventVO.getUserLoginText());
			usage.addUsageCharacteristic("sessionDomainName", dataServiceEventVO.getSessionDomainName());
			usage.addUsageCharacteristic("nasIpString", dataServiceEventVO.getNasIpString());
			usage.addUsageCharacteristic("accessPointNameNetworkString", dataServiceEventVO.getAccessPointNameNetworkString());
			usage.addUsageCharacteristic("locationAreaCd", dataServiceEventVO.getLocationAreaCd());
			
			usage.addUsageCharacteristic("servingNetworkString", dataServiceEventVO.getServingNetworkString());
			usage.addUsageCharacteristic("subSidId", dataServiceEventVO.getSubSidId());
			usage.addUsageCharacteristic("contentDeliveredInd", dataServiceEventVO.getContentDeliveredInd());
			usage.addUsageCharacteristic("hostDomainName", dataServiceEventVO.getHostDomainName());
			usage.addUsageCharacteristic("requestedURLString", dataServiceEventVO.getRequestedURLString());
			usage.addUsageCharacteristic("contentURLString", dataServiceEventVO.getContentURLString());
			usage.addUsageCharacteristic("multiplexId", dataServiceEventVO.getMultiplexId());
			
			usage.addUsageCharacteristic("statusRequestCd", dataServiceEventVO.getStatusRequestCd());
			usage.addUsageCharacteristic("statusResponseCd", dataServiceEventVO.getStatusResponseCd());
			usage.addUsageCharacteristic("recordSequenceNum", dataServiceEventVO.getRecordSequenceNum());
			usage.addUsageCharacteristic("chargingId", dataServiceEventVO.getChargingId());
			usage.addUsageCharacteristic("recordClosingTime", dataServiceEventVO.getRecordClosingTime());
			usage.addUsageCharacteristic("serviceAreaCd", dataServiceEventVO.getServiceAreaCd());
			usage.addUsageCharacteristic("terminationReasonCd", dataServiceEventVO.getTerminationReasonCd());
			usage.addUsageCharacteristic("accountingPlanName", dataServiceEventVO.getAccountingPlanName());
			usage.addUsageCharacteristic("recordDuplicateCheckNum", dataServiceEventVO.getRecordDuplicateCheckNum());
			usage.addUsageCharacteristic("cellSiteId", dataServiceEventVO.getCellSiteId());
			usage.addUsageCharacteristic("titleName", dataServiceEventVO.getTitleName());
			usage.addUsageCharacteristic("artistName", dataServiceEventVO.getArtistName());
			usage.addUsageCharacteristic("genre", dataServiceEventVO.getGenre());
			
			usage.addUsageCharacteristic("otherPartyPhoneNum", dataServiceEventVO.getOtherPartyPhoneNum());
			usage.addUsageCharacteristic("contentSizeQuantity", dataServiceEventVO.getContentSizeQuantity());
			usage.addUsageCharacteristic("recordTypeCd", dataServiceEventVO.getRecordTypeCd());
			usage.addUsageCharacteristic("recordStatusCd", dataServiceEventVO.getRecordStatusCd());
			usage.addUsageCharacteristic("furnishChargingCd", dataServiceEventVO.getFurnishChargingCd());
			usage.addUsageCharacteristic("chargingResultCd", dataServiceEventVO.getChargingResultCd());
			usage.addUsageCharacteristic("createUserId", dataServiceEventVO.getCreateUserId());
			usage.addUsageCharacteristic("createTime", dataServiceEventVO.getCreateTime());
			usage.addUsageCharacteristic("radioAccessTechTypeCd", dataServiceEventVO.getRadioAccessTechTypeCd());
			usage.addUsageCharacteristic("servedPacketDataProtocolAddressTxt", dataServiceEventVO.getServedPacketDataProtocolAddressTxt());
			usage.addUsageCharacteristic("networkTypeCd", dataServiceEventVO.getNetworkTypeCd());
			usage.addUsageCharacteristic("rawDataUsageDetail", dataServiceEventVO.getRawDataUsageDetail());
			usage.addUsageCharacteristic("sgsnaddressString", dataServiceEventVO.getSGSNAddressString());
			usage.addUsageCharacteristic("ggsnaddressString", dataServiceEventVO.getGGSNAddressString());
			
			usageList.add(usage);
		}
		return usageList;
	}
	
	
	public static void validateInputParameters(SearchRawUsageVO searchRawUsageVO) {
		
		if (StringUtils.length(searchRawUsageVO.getPhoneNumber()) != 10) {
			throw new ValidationException("Invalid Phone number");
		}
		searchRawUsageVO.setPhoneNumber("1" + searchRawUsageVO.getPhoneNumber());
		
	}	

	public static RawUsageListResponse convert(RawUsageListResponseVO item) throws ConvertorException {
		RawUsageListResponse result = new RawUsageListResponse();
		
		try{
			if(item!=null){

				result.setBatchInfoType(convert(item.getBatchInfoTypeVO(), true, true));
				result.setRawUsageListType(convertDataServiceEvents(item.getRawUsageList()));				
			}
		}
		catch(RuntimeException e){
			throw new ConvertorException("Conversion failed", e);
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
							
		return result == null ? new DataServiceEvent[]{} : result;		
	}
	
	public static BatchInfoType convert(BatchInfoTypeVO item, boolean alfa, boolean beta) {

		BatchInfoType result = new BatchInfoType();
		
			if(item!=null){
				result.setBatchNumber(convert(item.getBatchNumber()));
				result.setMoreDataExistInd(item.isMoreDataExistInd());
			}
		
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
//TODO2	    		result.setRecordSequenceNum(item.getRecordSequenceNum());
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

		return result;
		
	}

	
	
}

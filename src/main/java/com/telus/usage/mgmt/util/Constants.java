package com.telus.usage.mgmt.util;

public class Constants {
	//TODO - modify version for deployment
	public static final String VERSION = "DSAL - Storage optimization phase 2 - Feb Major Release 2020";
	public static final String APPLICATION_NAME = "DSAL";
	
	public static final String STATE_RAW = "raw";
	public static final String STATE_RATED = "rated";
	public static final String STATE_MEDIATED = "mediated";
	
	public static final String[] STATES = new String[]{STATE_RAW, STATE_RATED, STATE_MEDIATED};

	public static final String BILLING_METHOD_POSTPAID = "POSTPAID";
	public static final String BILLING_METHOD_PREPAID = "PREPAID";
	
	public static final String SERVICE_TYPE_WWB = "wwb";
	public static final String SERVICE_TYPE_WISP = "wisp";
	
	public static final int MAX_PAGING_SIZE_SUMMARY =500;
	public static final int MAX_PAGING_SIZE_RAW =100;
	public static final int MAX_PAGING_SIZE_DETAIL =100;
	
	public static final String NO_IND = "N";
	public static final String YES_IND = "Y";
	
	public static final String UNIT_OF_MEASURE_B = "B";
	public static final String UNIT_OF_MEASURE_BYTES = "bytes";
	public static final String UNIT_OF_MEASURE_KB = "KB";
	public static final String UNIT_OF_MEASURE_MB = "MB";
	public static final long CACHE_REFRESH_PERIOD = 12*60*60*1000;	
}

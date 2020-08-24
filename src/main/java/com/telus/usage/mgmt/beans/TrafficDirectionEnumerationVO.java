package com.telus.usage.mgmt.beans;

public class TrafficDirectionEnumerationVO extends ValueObject {
	public static final java.lang.String _all = "ALL";
	public static final java.lang.String _uplink = "UPLINK";
	public static final java.lang.String _downlink = "DOWNLINK";
	
	//private static Map<Object, Object> map;
	private String value;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}	
}

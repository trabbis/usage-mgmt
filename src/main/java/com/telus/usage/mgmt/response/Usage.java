package com.telus.usage.mgmt.response;

public class Usage {

	private String id;
	private String href;
	private String type;
	
	private UsageCharacteristic usageCharacteristic;
	
	
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getHref() {
		return href;
	}


	public void setHref(String href) {
		this.href = href;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public UsageCharacteristic getUsageCharacteristic() {
		return usageCharacteristic;
	}


	public void setUsageCharacteristic(UsageCharacteristic usageCharacteristic) {
		this.usageCharacteristic = usageCharacteristic;
	}
	
	
	public void addUsageCharacteristic(String key, String value) {
		usageCharacteristic.addNewCharacteric(key, value);
	}
	
}

package com.telus.usage.mgmt.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Usage {

	private String id;
	private String href;
	private String date;
	private String type;
	private String description;
	private String status;
	
	private List<UsageCharacteristic> usageCharacteristic = new ArrayList<UsageCharacteristic>();
//	private Map<String, Object> usageCharacteristic2 = new HashMap<String, Object>();
	
	
	public List<UsageCharacteristic> getUsageCharacteristic() {
		return usageCharacteristic;
	}

	public void setUsageCharacteristic(List<UsageCharacteristic> usageCharacteristic) {
		this.usageCharacteristic = usageCharacteristic;
	}

//	public Map<String, Object> getUsageCharacteristic2() {
//		return usageCharacteristic2;
//	}
//
//	public void setUsageCharacteristic2(Map<String, Object> usageCharacteristic2) {
//		this.usageCharacteristic2 = usageCharacteristic2;
//	}
//
//	
//	public void addUsageCharateristic2(String key, Object value) {
//		usageCharacteristic2.put(key, value);
//		
//	}

	public void addUsageCharacteristic(String key, Object value) {
		
		UsageCharacteristic item = new UsageCharacteristic();
		item.setName(key);
		item.setValue(String.valueOf(value));
		
		usageCharacteristic.add(item);
		
		
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


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


//	public UsageCharacteristic getUsageCharacteristic() {
//		return usageCharacteristic;
//	}
//
//
//	public void setUsageCharacteristic(UsageCharacteristic usageCharacteristic) {
//		this.usageCharacteristic = usageCharacteristic;
//	}
//	
//	
//	public void addUsageCharacteristic(String key, Object value) {
//		usageCharacteristic.addNewCharacteric(key, value);
//	}
	
}

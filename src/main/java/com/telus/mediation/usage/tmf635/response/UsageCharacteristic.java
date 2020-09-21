package com.telus.mediation.usage.tmf635.response;

import java.util.HashMap;
import java.util.Map;

public class UsageCharacteristic {

//	private Map<String, Object> characteristics = new HashMap<String, Object>();
//
//	public Map<String, Object> getCharacteristics() {
//		return characteristics;
//	}
//
//	public void setCharacteristics(Map<String, Object> characteristics) {
//		this.characteristics = characteristics;
//	}
//	
//	public void addNewCharacteric(String key, Object value) {
//		characteristics.put(key, value);
//	}
	
	private String name;
	private String value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}

package com.telus.usage.mgmt.response;

import java.util.HashMap;
import java.util.Map;

public class UsageCharacteristic {

	private Map<String, String> characteristics = new HashMap<String, String>();

	public Map<String, String> getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(Map<String, String> characteristics) {
		this.characteristics = characteristics;
	}
	
	public void addNewCharacteric(String key, String value) {
		characteristics.put(key, value);
	}
	
	
	
	
}

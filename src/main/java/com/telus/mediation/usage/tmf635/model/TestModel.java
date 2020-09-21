package com.telus.mediation.usage.tmf635.model;

//TODO delete after POC completed
public class TestModel {

	private String id;
    private String name;
    //private BigDecimal price;
    
    public TestModel(String id, String name) {
    	this.id = id;
    	this.name = name;
    }
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
}

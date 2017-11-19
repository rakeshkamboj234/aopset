package com.afteraop.model;

public class Circle{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		this.name = name;
		throw(new RuntimeException());
	}
	
	public String setNamedReturn(String name) {
		this.name = name;
		return name;
	}
	
}
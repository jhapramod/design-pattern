package com.pramod.designpatterns.creational.prototype.usingserialization;

import java.io.Serializable;

public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int houseNumber;
	public String district;
	public String state;
	
	
	public Address(int houseNumber, String district, String state) {
		super();
		this.houseNumber = houseNumber;
		this.district = district;
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", district=" + district + ", state=" + state + "]";
	}
}

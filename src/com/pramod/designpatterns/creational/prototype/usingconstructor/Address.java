package com.pramod.designpatterns.creational.prototype.usingconstructor;

public class Address {
	public int houseNumber;
	public String district;
	public String state;
	
	
	public Address(int houseNumber, String district, String state) {
		super();
		this.houseNumber = houseNumber;
		this.district = district;
		this.state = state;
	}
	
	public Address(Address other) {
		houseNumber = other.houseNumber ;
		district = other.district;
		state = other.state;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", district=" + district + ", state=" + state + "]";
	}

}

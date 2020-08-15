package com.pramod.designpatterns.creational.prototype.usingclone;

public class Address implements Cloneable{
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
		return "Address [houseNumber=" + houseNumber + ", " + "district=" + district + ", state=" + state + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Address(houseNumber, district, state);
	}

}

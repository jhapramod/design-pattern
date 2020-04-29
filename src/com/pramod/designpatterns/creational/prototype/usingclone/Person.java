package com.pramod.designpatterns.creational.prototype.usingclone;

public class Person implements Cloneable{
	
	public String firstName;
	public String lastName;
	public Address address;

	public Person(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", "
				+ "lastName=" + lastName + ", "
						+ "address=" + address + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Person(firstName, lastName, (Address)address.clone());
	}
	
}

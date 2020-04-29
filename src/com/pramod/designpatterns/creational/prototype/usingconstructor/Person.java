package com.pramod.designpatterns.creational.prototype.usingconstructor;


public class Person {
	public String firstName;
	public String lastName;
	
	public Address address;

	public Person(String firstName, String lastName, Address address) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public Person(Person other) {
		firstName = other.firstName;
		lastName = other.lastName;
		address = new Address(other.address);
		
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	

}

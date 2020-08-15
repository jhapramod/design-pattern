package com.pramod.designpatterns.creational.prototype.usingserialization;

import org.apache.commons.lang3.SerializationUtils;

public class PrototypeDemo {

	public static void main(String[] args) {
		Person person1 = new Person("Pramod", "Jha", new Address(123, "Bangalore", "Karnataka"));
		
		Person person2 = SerializationUtils.roundtrip(person1);
		
		person2.firstName = "Sanjeev";
		person2.address.houseNumber = 124;
		
		System.out.println(person1);
		System.out.println(person2);

	}

}

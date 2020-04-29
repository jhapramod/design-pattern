package com.pramod.designpatterns.creational.prototype.usingclone;

public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person person1 = new Person("Pramod", "Jha", 
				new Address(123, "Bangalore", "Karnataka"));		
		
		Person person2 = (Person) person1.clone();
		person2.firstName = "Sanjeev";
		person2.address.houseNumber = 124;
		
		System.out.println(person1);
		System.out.println(person2);

	}

}

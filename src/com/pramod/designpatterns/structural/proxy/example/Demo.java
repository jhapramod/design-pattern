package com.pramod.designpatterns.structural.proxy.example;

public class Demo {

	public static void main(String[] args) {
		ContactList contactList = new ContactListProxyImpl();
		
		Company company = new Company("Geeksforgeeks", "India", "+91-011-28458965", contactList); 
		System.out.println("Company Name: " + company.getCompanyName()); 
        System.out.println("Company Address: " + company.getCompanyAddress()); 
        System.out.println("Company Contact No.: " + company.getCompanyContactNo()); 
        System.out.println("Requesting for contact list"); 
        
        contactList = company.getContactList();
        contactList.getEmployeeList().forEach(System.out::println);
        

	}

}

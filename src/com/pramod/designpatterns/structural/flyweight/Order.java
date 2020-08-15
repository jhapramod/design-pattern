package com.pramod.designpatterns.structuralpattern.flyweight;

public class Order {
	private int orderNumber;
	private Item item;
	
	public Order(Item item, int orderNumber) {
		this.item = item;
		this.orderNumber = orderNumber;
	}

	public void processOrder() {
		System.out.println("Ordering " + item + " for order number " + orderNumber);
		
	}
	
	
	
	
}

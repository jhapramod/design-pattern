package com.pramod.designpatterns.structuralpattern.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

	private final Catalog catalog = new Catalog();
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();
	
	public void takeOrder(String itemName, int orderNumber) {
		Item item = catalog.lookup(itemName);
		Order order = new Order(item, orderNumber);
		orders.add(order);
	}
	
	void process() {
		for (Order order : orders) {
			order.processOrder();
			orders.remove(order);
		}
	}

	public String report() {
		return "Total item objects made : " + catalog.totalItemsMade();
	}
	
	
	
}

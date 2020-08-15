package com.pramod.designpatterns.structuralpattern.flyweight;

public class FlyweightInventoryDemo {

	public static void main(String[] args) {
		InventorySystem ims = new InventorySystem();
		
		ims.takeOrder("Roomba", 221);
		ims.takeOrder("Bose Headphone", 361);
		ims.takeOrder("Samsung TV", 441);
		ims.takeOrder("Roomba", 172);
		ims.takeOrder("Bose Headphone", 7575);
		ims.takeOrder("Samsung TV", 285);
		ims.takeOrder("Roomba", 5824);
		ims.takeOrder("Bose Headphone", 6878);
		ims.takeOrder("Samsung TV", 2452);
		ims.takeOrder("Roomba", 8);
		ims.takeOrder("Bose Headphone", 43);
		ims.takeOrder("Samsung TV", 6575);
		ims.takeOrder("Roomba", 242424);
		ims.takeOrder("Bose Headphone", 78587);
		ims.takeOrder("Samsung TV", 542452);
		ims.takeOrder("Roomba", 54257);
		ims.takeOrder("Bose Headphone", 272);
		ims.takeOrder("Samsung TV", 4523);
		
		ims.process();
		
		System.out.println(ims.report());
		

	}

}

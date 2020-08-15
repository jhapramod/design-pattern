package com.pramod.designpatterns.structural.bridge.example2;

public class ProduceWorkshop extends Workshop {

	@Override
	protected void work(Vehicle vehicle) {
		System.out.println("Producing.. " );
		System.out.println("Time taken : " + vehicle.workTime() + " Days");
		
	}

}

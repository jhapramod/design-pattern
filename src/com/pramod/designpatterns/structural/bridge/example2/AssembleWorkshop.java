package com.pramod.designpatterns.structural.bridge.example2;

public class AssembleWorkshop extends Workshop {

	@Override
	protected void work(Vehicle vehicle) {
		System.out.println("Assembling ...");
		
	}

}

package com.pramod.designpatterns.structural.bridge.example2;

import java.util.List;

public class Car extends Vehicle {

	public Car(List<Workshop> workshops) {
		super(workshops);
	}

	@Override
	protected void manufacture() {
		System.out.println("Manufacturing Car ...");
		workshops.forEach(workShop -> workShop.work(this));
		System.out.println("Manufacturing DONE !");
		workTime();

	}

	@Override
	protected int workTime() {
		return 24;

	}

}

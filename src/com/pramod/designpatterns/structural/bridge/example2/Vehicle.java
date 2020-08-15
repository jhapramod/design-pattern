package com.pramod.designpatterns.structural.bridge.example2;

import java.util.List;

public abstract class Vehicle {
	protected List<Workshop> workshops;

	public Vehicle(List<Workshop> workshops) {
		this.workshops = workshops;
	}
	
	protected abstract void manufacture();
	protected abstract int workTime();
}

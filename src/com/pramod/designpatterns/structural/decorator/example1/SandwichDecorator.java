package com.pramod.designpatterns.structural.decorator.example1;

public abstract class SandwichDecorator implements Sandwich {

	private Sandwich customSandwich;
	
	public SandwichDecorator(Sandwich sandwich) {
		this.customSandwich = sandwich;
	}

	@Override
	public String make() {
		return customSandwich.make();
	}

	

}

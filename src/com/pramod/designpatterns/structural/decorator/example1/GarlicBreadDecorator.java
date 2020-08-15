package com.pramod.designpatterns.structural.decorator.example1;

public class GarlicBreadDecorator extends SandwichDecorator {

	public GarlicBreadDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	
	@Override
	public String make() {
		return super.make() + addGarlicBread();
	}

	private String addGarlicBread() {
		return " + Garlic Bread";
	}
}

package com.pramod.designpatterns.structural.decorator.example1;

public class MeatDecorator extends SandwichDecorator {

	public MeatDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	
	@Override
	public String make() {
		return super.make() + addMeat();
	}

	private String addMeat() {
		return " + chicken";
	}
}

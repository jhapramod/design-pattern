package com.pramod.designpatterns.structural.decorator.example1;

public class DressingDecorator extends SandwichDecorator {

	public DressingDecorator(Sandwich sandwich) {
		super(sandwich);
	}

	@Override
	public String make() {
		return super.make() + addDressing();
	}

	private String addDressing() {
		return " + Cheeze";
	}
	

}

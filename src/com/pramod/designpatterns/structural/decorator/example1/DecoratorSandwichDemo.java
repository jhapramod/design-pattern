package com.pramod.designpatterns.structural.decorator.example1;

public class DecoratorSandwichDemo {

	public static void main(String[] args) {
		Sandwich sandwich = new GarlicBreadDecorator(new DressingDecorator(new MeatDecorator(new SimpleSandwich())));
		
		System.out.println(sandwich.make());

	}

}

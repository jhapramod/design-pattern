package com.pramod.designpatterns.structural.decorator.example3;

public class Circle implements Shape {

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public Circle() {}
	
	public int resize(int factor) {
		return radius * factor;
	}

	@Override
	public String info() {
		return "Circle of radius " + radius;
		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}

package com.pramod.designpatterns.structural.decorator.example3;

public class Square implements Shape {

	private int side;
	public Square(int side) {
		this.side = side;
	}
	public Square() {}


	@Override
	public String info() {
		return "Square of side : " + side;

	}

}

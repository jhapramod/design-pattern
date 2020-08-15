package com.pramod.designpatterns.structural.decorator.example3;

import java.util.function.Supplier;

//public class ColoredShape implements Shape {
//
//	private Shape shape;
//	private String color;
//	
//	public ColoredShape(Shape shape, String color) {
//		this.shape = shape;
//		this.color = color;
//	}
//
//	@Override
//	public String info() {
//		return shape.info() + " and Color : " + color;
//
//	}
//
//}


public class ColoredShape<T extends Shape> implements Shape {

	private Shape shape;
	private String color;
	
	public ColoredShape(Supplier<? extends Shape> supllier, String color) {
		this.shape = supllier.get();
		this.color = color;
	}

	@Override
	public String info() {
		return shape.info() + " and Color : " + color;

	}

}
package com.pramod.designpatterns.structural.decorator.example3;

import java.util.function.Supplier;

//public class TransparentColoredShape implements Shape {
//
//	private ColoredShape coloredShape;
//	private int transparency;
//	
//	
//	public TransparentColoredShape(ColoredShape coloredShape, int transparency) {
//		super();
//		this.coloredShape = coloredShape;
//		this.transparency = transparency;
//	}
//
//
//	@Override
//	public String info() {
//		return coloredShape.info() + " and transparency "+ transparency +" %";
//	}
//
//}


public class TransparentColoredShape<T extends Shape> implements Shape {

	private ColoredShape<T> coloredShape;
	private int transparency;
	
	
	public TransparentColoredShape(Supplier<? extends ColoredShape<T>> supplier, int transparency) {
		this.coloredShape = supplier.get();
		this.transparency = transparency;
	}


	@Override
	public String info() {
		return coloredShape.info() + " and transparency "+ transparency +" %";
	}

}

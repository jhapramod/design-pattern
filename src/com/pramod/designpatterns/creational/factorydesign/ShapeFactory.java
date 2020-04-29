package com.pramod.designpatterns.creational.factorydesign;

public class ShapeFactory {
	public Shape creteShate(ShapeType shapetype) {
		switch(shapetype) {
		case CIRCLE :
			return new Circle();
		case POLYGON :
			return new Polygon();
		case RECTANGLE:
			return new Rectangle();

		}
		return null;
	}

}

package com.pramod.designpatterns.creational.factorydesign;

import java.util.Calendar;

public class EveryDayExample {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape circle = factory.creteShate(ShapeType.CIRCLE);
		circle.draw();
		
		Shape polygon = factory.creteShate(ShapeType.POLYGON);
		polygon.draw();
		
		Shape rec = factory.creteShate(ShapeType.RECTANGLE);
		rec.draw();

	}

}

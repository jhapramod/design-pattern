package com.pramod.designpatterns.structural.decorator.example3;

public class DecoratorDemo {

	public static void main(String[] args) {
		Shape shape = new Circle(20);
		System.out.println(shape.info());
		
//		ColoredShape blueSquare = new ColoredShape(new Square(10), "blue");
//		System.out.println(blueSquare.info());
//		
//		TransparentColoredShape halfTransparentGreeCircle = new TransparentColoredShape(
//				new ColoredShape(
//						new Circle(10), "green"), 50);
//		System.out.println(halfTransparentGreeCircle.info());
		
		ColoredShape<Square> blueSquare = new ColoredShape<>(() -> new Square(10), "blue");
		System.out.println(blueSquare.info());
		
		TransparentColoredShape<Circle> halfTransparentGreenCircle = new TransparentColoredShape<>(
				() -> new ColoredShape<>(() -> new Circle(20), "GREEN"), 
				50);
		
		System.out.println(halfTransparentGreenCircle.info());
	}

}

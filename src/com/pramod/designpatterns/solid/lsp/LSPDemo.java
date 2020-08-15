package com.pramod.designpatterns.solid.lsp;

public class LSPDemo {

	public static void main(String[] args) {
		Rectangle r = new Square();
		r.setWidth(10);
		r.setHeight(20);
		
		System.out.println("Area : " + r.getArea());

	}

}

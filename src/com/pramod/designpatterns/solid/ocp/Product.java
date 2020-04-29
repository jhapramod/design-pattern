package com.pramod.designpatterns.solid.ocp;

public class Product {
	private String name;
	private Size size;
	private Color color;
	
	public Product(String name, Size size, Color color) {
		super();
		this.name = name;
		this.size = size;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", size=" + size + ", color=" + color + "]";
	}
	
	
	
	

}

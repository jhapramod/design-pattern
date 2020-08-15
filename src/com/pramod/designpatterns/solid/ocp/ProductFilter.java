package com.pramod.designpatterns.solid.ocp;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {
	
	public List<Product> filterByColor(List<Product> products, Color color) {

		return products.stream().filter(p -> p.getColor() == color).collect(Collectors.toList());

	}
	
	public List<Product> filterBySize(List<Product> products, Size size) {

		return products.stream().filter(p -> p.getSize() == size).collect(Collectors.toList());

	}
	
	public List<Product> filterBySizeAndColor(List<Product> products, Size size, Color color) {

		return products.stream().filter(p -> p.getSize() == size && p.getColor() == color).collect(Collectors.toList());

	}

}

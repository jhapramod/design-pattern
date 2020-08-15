package com.pramod.designpatterns.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class OCPDemo {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Apple", Size.SMALL, Color.GREEN));
		products.add(new Product("Apple", Size.SMALL, Color.RED));
		
		products.add(new Product("Tree", Size.LARGE, Color.GREEN));
		
		products.add(new Product("House", Size.LARGE, Color.BLUE));
		
		ProductFilter filter = new ProductFilter();
		filter.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(p.getName() + " is Green") );

	}

}

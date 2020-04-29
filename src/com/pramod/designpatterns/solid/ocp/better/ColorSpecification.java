package com.pramod.designpatterns.solid.ocp.better;

import com.pramod.designpatterns.solid.ocp.Color;
import com.pramod.designpatterns.solid.ocp.Product;

public class ColorSpecification implements Specification<Product>{

	private Color color;

	  public ColorSpecification(Color color) {
	    this.color = color;
	  }
	  
	@Override
	public boolean isSatified(Product p) {
		return p.getColor() == color;
	}
	
}

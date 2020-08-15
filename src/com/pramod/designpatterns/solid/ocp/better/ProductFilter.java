package com.pramod.designpatterns.solid.ocp.better;

import java.util.List;
import java.util.stream.Collectors;

import com.pramod.designpatterns.solid.ocp.Product;

public class ProductFilter implements Filter<Product>{

	@Override
	public List<Product> filter(List<Product> products, Specification<Product> spec) {
		return products
			.stream()
			.filter(p -> spec.isSatified(p)).collect(Collectors.toList());
		
	}

}

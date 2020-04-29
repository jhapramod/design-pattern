package com.pramod.designpatterns.solid.ocp.better;

public interface Specification<T> {
	
	boolean isSatified(T item);
}

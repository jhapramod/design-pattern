package com.pramod.designpatterns.structuralpattern.adaptor;

import java.util.Arrays;
import java.util.List;

public class EveryDayExample {

	public static void main(String[] args) {
		Integer[] array = new Integer[] {1,2,3};
		
		List<Integer> list = Arrays.asList(array);
		
		System.out.println(array);
		
		System.out.println(list);

	}

}

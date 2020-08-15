package com.pramod.designpatterns.creational.builder;

public class BuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hi Team we are ")
		.append(8)
		.append(" member team ");
		
		System.out.println(sb);

	}

}

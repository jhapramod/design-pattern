package com.pramod.designpatterns.creational.singleton;

public class SingletonDemo {

	public static void main(String[] args) throws Exception {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);

	}

}

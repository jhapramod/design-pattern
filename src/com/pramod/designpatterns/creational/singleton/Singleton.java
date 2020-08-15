package com.pramod.designpatterns.creational.singleton;

public class Singleton implements Cloneable {

	private static Singleton INSTANCE = null;

	private Singleton() throws Exception {
		if (INSTANCE != null) {
			throw new Exception("Use getInstance method");
		}
	}

	public static Singleton getInstance() throws Exception {
		if (INSTANCE == null) {
			synchronized (Singleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new Singleton();
				}
			}
		}

		return INSTANCE;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

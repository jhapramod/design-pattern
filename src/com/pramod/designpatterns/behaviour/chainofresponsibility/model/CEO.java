package com.pramod.designpatterns.behaviour.chainofresponsibility.model;

public class CEO extends Handler {

	@Override
	public void handleRequest(Request request) {
		System.out.println("CEO can approve request amount more than 1500");

	}
}

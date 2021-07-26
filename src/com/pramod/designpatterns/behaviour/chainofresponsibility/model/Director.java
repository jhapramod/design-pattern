package com.pramod.designpatterns.behaviour.chainofresponsibility.model;

public class Director extends Handler{

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.CONFRENSE) {
			System.out.println("Directed can approve confrences");
		} else {
			succesor.handleRequest(request);
		}
		
	}

}

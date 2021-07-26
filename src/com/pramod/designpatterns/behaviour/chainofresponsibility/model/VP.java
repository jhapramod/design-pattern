package com.pramod.designpatterns.behaviour.chainofresponsibility.model;

public class VP extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.PURCHAGE) {
			if(request.getAmount() > 1500) 
			System.out.println("VP cannot approve request amount more than 1500");
		} else {
			succesor.handleRequest(request);
		}
		
	}

}

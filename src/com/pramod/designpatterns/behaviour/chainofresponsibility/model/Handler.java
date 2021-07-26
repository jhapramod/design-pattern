package com.pramod.designpatterns.behaviour.chainofresponsibility.model;

public abstract class Handler {
	protected Handler succesor;
	public abstract void handleRequest(Request request);

	public void setSuccesor(Handler succesor) {
		this.succesor = succesor;
	} 
}

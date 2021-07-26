package com.pramod.designpatterns.behaviour.chainofresponsibility;

import com.pramod.designpatterns.behaviour.chainofresponsibility.model.CEO;
import com.pramod.designpatterns.behaviour.chainofresponsibility.model.Director;
import com.pramod.designpatterns.behaviour.chainofresponsibility.model.VP;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		Director director = new Director();
		VP vp = new VP();
		CEO ceo = new CEO();
		
		director.setSuccessor(vp);

	}

}

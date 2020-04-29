package com.pramod.designpatterns.creational.abstractfactorydesign;

public class VisaPlatinumCreditCard extends CreditCard {

	@Override
	protected int cardNoLength() {
		return 20;
	}

}

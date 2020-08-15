package com.pramod.designpatterns.creational.abstractfactorydesign;

public class VisaGoldCreditCard extends CreditCard {

	@Override
	protected int cardNoLength() {
		return 16;
	}

}

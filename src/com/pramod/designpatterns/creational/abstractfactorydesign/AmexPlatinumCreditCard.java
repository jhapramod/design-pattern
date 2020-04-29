package com.pramod.designpatterns.creational.abstractfactorydesign;

public class AmexPlatinumCreditCard extends CreditCard {

	@Override
	protected int cardNoLength() {
		return 16;
	}

}

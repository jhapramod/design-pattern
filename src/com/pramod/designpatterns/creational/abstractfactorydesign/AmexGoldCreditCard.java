package com.pramod.designpatterns.creational.abstractfactorydesign;

public class AmexGoldCreditCard extends CreditCard {

	@Override
	protected int cardNoLength() {
		return 18;
	}

}

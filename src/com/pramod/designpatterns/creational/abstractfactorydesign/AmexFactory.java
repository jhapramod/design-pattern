package com.pramod.designpatterns.creational.abstractfactorydesign;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditcard(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new AmexGoldCreditCard();

		case PLATINUM:
			return new AmexPlatinumCreditCard();
		}
		return null;
	}

}

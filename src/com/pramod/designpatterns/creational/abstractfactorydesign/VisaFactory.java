
package com.pramod.designpatterns.creational.abstractfactorydesign;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditcard(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new VisaGoldCreditCard();

		case PLATINUM:
			return new VisaPlatinumCreditCard();
		}
		return null;
	}

}

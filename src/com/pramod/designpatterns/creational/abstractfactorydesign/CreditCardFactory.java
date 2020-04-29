package com.pramod.designpatterns.creational.abstractfactorydesign;

public abstract class CreditCardFactory {
	
	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if(creditScore > 700) {
			return new AmexFactory();
		} else {
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditcard(CardType cardType);

}

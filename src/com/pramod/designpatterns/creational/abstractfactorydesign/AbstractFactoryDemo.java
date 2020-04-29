package com.pramod.designpatterns.creational.abstractfactorydesign;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		CreditCardFactory abstractFatory = CreditCardFactory.getCreditCardFactory(775);
		CreditCard card = abstractFatory.getCreditcard(CardType.PLATINUM);
		System.out.println(card.getClass());

		abstractFatory = CreditCardFactory.getCreditCardFactory(650);
		card = abstractFatory.getCreditcard(CardType.GOLD);
		System.out.println(card.getClass());
	}

}

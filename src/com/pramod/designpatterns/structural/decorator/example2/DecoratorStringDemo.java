package com.pramod.designpatterns.structural.decorator.example2;

public class DecoratorStringDemo {

	public static void main(String[] args) {
		MagicString magicString = new MagicString("Pranaya");
		System.out.println(magicString + " has " + magicString.NumberOfVowels() + " vowels");

	}

}

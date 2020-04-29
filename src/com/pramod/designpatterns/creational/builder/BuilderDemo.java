package com.pramod.designpatterns.creational.builder;

import com.pramod.designpatterns.creational.builder.Email.EmailBuilder;

public class BuilderDemo {

	public static void main(String[] args) {
		EmailBuilder eb = new EmailBuilder();
		eb.addRecipient("pramod.kumar@sabre.com");
//		.addSubjectLine("Test")
//		.addMessageBody("Demo ");
		
		System.out.println(eb.build());

	}

}

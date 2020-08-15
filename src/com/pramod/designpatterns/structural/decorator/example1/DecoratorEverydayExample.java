package com.pramod.designpatterns.structural.decorator.example1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorEverydayExample {

	public static void main(String[] args) throws Exception {
		File file = new File("./data.txt");
		file.createNewFile();
		
		OutputStream outputStream = new FileOutputStream(file);
		DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
		dataOutputStream.writeChars("Hello Decorator");
		
		dataOutputStream.close();
		outputStream.close();
		
		

	}

}

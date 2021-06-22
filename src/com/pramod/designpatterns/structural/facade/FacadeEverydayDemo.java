package com.pramod.designpatterns.structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEverydayDemo {


	public static void main(String[] args) throws IOException {
		URL url = new URL("http", "www.pluralsight.com", 80, "/author/brayan-hansen");
		
		InputStreamReader inputStream = new InputStreamReader(url.openStream());
		BufferedReader reader = new BufferedReader(inputStream);
		
		String readLine;
		while((readLine = reader.readLine()) != null) {
			System.out.println(readLine);
		}

	}

}

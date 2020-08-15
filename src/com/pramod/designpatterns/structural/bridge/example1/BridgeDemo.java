package com.pramod.designpatterns.structural.bridge.example1;

public class BridgeDemo {

	public static void main(String[] args) {
		Movie movie = new Movie("Action", "2:15", "John Wick", "2014");
		
		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);
		
		String printMaterial = moviePrinter.printer(printFormatter);
		
		System.out.println(printMaterial);
		
		Formatter htmlFormatter = new HtmlFormatter();
		String htmlMaterial = moviePrinter.printer(htmlFormatter);
		
		System.out.println(htmlMaterial);
		
		
		Book book = new Book("Ramayan", "1000", "Unknown", "Ved Vyas");
		Printer bookPrinter = new BookPrinter(book);
		
		printMaterial = bookPrinter.printer(printFormatter);
		htmlMaterial = bookPrinter.printer(htmlFormatter);
		
		System.out.println(printMaterial);
		System.out.println(htmlMaterial);
		

	}

}

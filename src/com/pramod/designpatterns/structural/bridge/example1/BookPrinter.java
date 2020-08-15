package com.pramod.designpatterns.structural.bridge.example1;

import java.util.ArrayList;
import java.util.List;

public class BookPrinter extends Printer {
	private Book book;
	
	public BookPrinter(Book book) {
		this.book = book;
	}

	@Override
	protected List<Detail> getDetails() {
		List<Detail> details = new ArrayList<>();
		details.add(new Detail("Book Title", book.getTitle()));
		details.add(new Detail("Author", book.getAuthor()));
		details.add(new Detail("No of Pages", book.getPageCount()));
		details.add(new Detail("Year of Publish", book.getPublishYear()));
		return details;
	}

	@Override
	protected String getHeader() {
		return book.getTitle();
	}

}

package com.pramod.designpatterns.structural.bridge.example1;

public class Book {
	private String title;
	private String pageCount;
	private String publishYear;
	private String author;
	
	public Book(String title, String pageCount, String publishYear, String author) {
		this.title = title;
		this.pageCount = pageCount;
		this.publishYear = publishYear;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPageCount() {
		return pageCount;
	}
	public void setPageCount(String pageCount) {
		this.pageCount = pageCount;
	}
	public String getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(String publishYear) {
		this.publishYear = publishYear;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}

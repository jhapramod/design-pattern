package com.pramod.designpatterns.structural.bridge.example1;

public class Movie {
	
	private String classification;
	private String runtime;
	private String title;
	private String year;
	
	public Movie(String classification, String runtime, String title, String year) {
		this.classification = classification;
		this.runtime = runtime;
		this.title = title;
		this.year = year;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	

}

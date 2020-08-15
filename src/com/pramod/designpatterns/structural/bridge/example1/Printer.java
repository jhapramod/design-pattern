package com.pramod.designpatterns.structural.bridge.example1;

import java.util.List;

public abstract class Printer {
	public String printer(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}

	protected abstract List<Detail> getDetails();

	protected abstract String getHeader();

}

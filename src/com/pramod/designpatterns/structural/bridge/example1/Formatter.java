package com.pramod.designpatterns.structural.bridge.example1;

import java.util.List;

public interface Formatter {
	String format(String header, List<Detail> details);
}

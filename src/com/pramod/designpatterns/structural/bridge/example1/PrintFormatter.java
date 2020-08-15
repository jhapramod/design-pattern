package com.pramod.designpatterns.structural.bridge.example1;

import java.util.List;

public class PrintFormatter implements Formatter {

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder builder = new StringBuilder();
		builder.append(header);
		builder.append("\n");
		
		details.forEach(d -> {
			builder.append(d.getLabel());
			builder.append(":");
			builder.append(d.getValue());
			builder.append("\n");
			});
		
		return builder.toString();
	}

}

package com.pramod.designpatterns.structural.bridge.example1;

import java.util.List;

public class HtmlFormatter implements Formatter {

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder builder = new StringBuilder();
		builder.append("<table>");
		
		builder.append("<th>");
		builder.append("Classification : ");
		builder.append("</th>");
		
		builder.append("<th>");
		builder.append(header);
		builder.append("</th>");
		
		details.forEach(d -> {
			builder.append("<tr><td>");
			builder.append(d.getLabel());
			builder.append("</td><td>");
			builder.append(d.getValue());
			builder.append("</td><tr>");
		});
		
		builder.append("</table>");
		
		
		return builder.toString();
	}

}

package com.pramod.designpatterns.solid.isp;

import org.w3c.dom.Document;

public interface DocumentGenerator {
	
	void generateFdfFile(Document doc);
	void generateWordFile(Document doc) throws Exception;

}

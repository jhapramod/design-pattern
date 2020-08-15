package com.pramod.designpatterns.solid.isp;

import org.w3c.dom.Document;

public class PdfGenerator implements DocumentGenerator{

	@Override
	public void generateFdfFile(Document doc) {
		// logic 
		
	}

	@Override
	public void generateWordFile(Document doc) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Word not supported");
	}

	

}

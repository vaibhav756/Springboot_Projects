package com.SpringBoot.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
public class PdfReport implements IReport {

	@Override
	public void generateReport() {
		System.out.println("Generating PDF Report.....");
	}

}

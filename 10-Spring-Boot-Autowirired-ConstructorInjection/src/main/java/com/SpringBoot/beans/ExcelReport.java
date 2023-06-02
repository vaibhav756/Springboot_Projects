package com.SpringBoot.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
@Primary()
public class ExcelReport implements IReport {

	@Override
	public void generateReport() {
		System.out.println("Generating Excel Report");
	}

}

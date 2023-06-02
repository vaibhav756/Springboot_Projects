package com.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.SpringBoot.beans.IReport;
@Service
public class ReportService {
	
	private IReport report;
	
	@Autowired()
	public ReportService(IReport report)
	{
		this.report=report;
		System.out.println("Injected Bean"+report.getClass().getName());
	}
	
	public void downloadReport()
	{
		report.generateReport();
		System.out.println("Download Started.....");
	}
}

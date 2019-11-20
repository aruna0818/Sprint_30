package com.jvmreports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {
	public static void generatecucumberReports(String jsonFileloc) {
				
		File jvmreports=new File("C:\\Users\\ARUNACHALAM\\eclipse-workspace\\Sampl\\src\\test\\resources\\reports");
		Configuration con=new Configuration(jvmreports,"arun project reports");
		
		con.addClassifications("browsername","chrome");
		
		con.addClassifications("os","windows 10");
		
		con.addClassifications("sprint", "18");
		
		List<String> listofjf=new ArrayList<String>();
		listofjf.add(jsonFileloc);
		
		ReportBuilder builder=new ReportBuilder(listofjf, con);
		builder.generateReports();
		
	}
	
	
	

}

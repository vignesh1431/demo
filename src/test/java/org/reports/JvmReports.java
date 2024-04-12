package org.reports;

import java.io.File;
import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {
	
	public static void repotjvm(String jsonPath) {

		File f = new File("C:\\Users\\User\\eclipse-workspace\\cumcumberflipkart\\Reports\\JVM");
		
		net.masterthought.cucumber.Configuration c = new net.masterthought.cucumber.Configuration(f, "createAcc");
		c.addClassifications("os", "windowa10");
		
		List<String> l = new ArrayList<String>();
		l.add(jsonPath);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
		

	}
	
	

}

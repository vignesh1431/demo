package testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.JvmReports;

import cucumber.api.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features="C:\\Users\\User\\eclipse-workspace\\cumcumberflipkart\\src\\test\\resources\\featurefile\\flipkart.feature",

plugin = {"html:C:\\Users\\User\\eclipse-workspace\\cumcumberflipkart\\Reports\\Html",
		
		"junit:C:\\Users\\User\\eclipse-workspace\\cumcumberflipkart\\Reports\\Junit\\junit.xml",
		"json:C:\\Users\\User\\eclipse-workspace\\cumcumberflipkart\\Reports\\Json\\json.son"
		
},
glue = "org.step")



public class TestRunner {
	
	@AfterClass
	public static void reports() {
		
		JvmReports.repotjvm("C:\\Users\\User\\eclipse-workspace\\cumcumberflipkart\\Reports\\Json\\json.son");

	}
	
	

}

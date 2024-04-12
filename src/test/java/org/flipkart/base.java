package org.flipkart;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	
	
	public static WebDriver driver;
	public  static void  chromeBrowser() {
		driver=new ChromeDriver();
	}
	public static void maxwindow()
	{
		driver.manage().window().maximize();
	}
	public static void geturl(String url)
	{
		driver.get(url);
	}
	public static void sendValues(WebElement ele,String Values)
	{
		ele.sendKeys(Values);
	}
	public static void btnClick(WebElement ref)
	{
		ref.click();
	}
	
	
	
	
	public static void closeBrowser()
	{
		driver.quit();
	}
	public static void dateAndTime()
	{
		Date d = new Date();
	}
	public static String title ()
	{
		return driver.getTitle();
		
	}
	public static void window()
	{
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set< String> child = driver .getWindowHandles();
		System.out.println(child);
		List<String> li = new LinkedList<String>();
		li.addAll(child);
		driver.switchTo().window(li.get(1));
		
		
	}
	
	
	
	
}

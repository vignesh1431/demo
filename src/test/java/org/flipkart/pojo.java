package org.flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojo  extends base{
	
	public pojo() {
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getProduct() {
		return product;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getAdd() {
		return add;
	}


	@FindBy(xpath ="//input[@class=\"Pke_EE\"]")
	private WebElement product;
	
	
	@FindBy(xpath ="//div[text()='Apple iPhone 15 (Pink, 128 GB)']")
	private WebElement phone;
	
	@FindBy(xpath ="//button[text()=\"Add to cart\"]")
	private WebElement add;

	
	}
	
	
	
	
	



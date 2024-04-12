package org.step;

import org.flipkart.base;
import org.flipkart.pojo;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends base{

	pojo p;


	@Given("open the chrome browser")
	public void open_the_chrome_browser() {
		chromeBrowser();
		maxwindow();
		geturl("https://www.flipkart.com/");
	}

	@When("Enter the product name")
	public void enter_the_product_name() {
		p = new pojo();
		WebElement product = p.getProduct();
		sendValues(product, "iphone");
		product.submit();
	}

	@When("Choose a product")
	public void choose_a_product() {
		p = new pojo();
		WebElement phone = p.getPhone();
		phone.click();
	}

	@When("switch to another page")
	public void switch_to_another_page() {
		window();
	}



	@Then("Add a product to cart")


	public void add_a_product_to_cart() {
		p = new pojo();
		WebElement add = p.getAdd();
		add.click();
	}
}

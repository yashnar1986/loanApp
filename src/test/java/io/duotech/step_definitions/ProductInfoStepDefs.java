package io.duotech.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Set;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.pages.DressesPage;
import io.duotech.pages.HomePage;
import io.duotech.pages.LoginPage;
import io.duotech.pages.ProductPage;
import io.duotech.utilities.Driver;
import io.duotech.utilities.LoggerUtils;

public class ProductInfoStepDefs {
	String homepageName;
	Integer globalTimes;
	
	DressesPage dressPage;
	
	
	
	Logger logger = LoggerUtils.getLogger(ProductInfoStepDefs.class);
	
	
	@When("I click on Blouse")
	public void i_click_on_Blouse() {
	    HomePage homepage = new HomePage();
	    homepageName = homepage.blouse.getText();
	    logger.info("Clicking on blouse");
	    homepage.blouse.click();
	}
	@Then("The product page should also display Blouse")
	public void the_product_page_should_also_display_Blouse() {
	    ProductPage productPage = new ProductPage();
	    String productPageName = productPage.productName.getText();
	    logger.info("Verifying the product name as Blouse");
	    assertEquals(homepageName, productPageName);
	}
	
	
	@Then("I land on product page")
	public void i_land_on_product_page() {
	  String actual = Driver.getDriver().getTitle();
	  String expected = "Blouse - My Store";
	  assertEquals(expected, actual);
	}

	@Then("The default quantity for the product should be {int}")
	public void the_default_quantity_for_the_product_should_be(Integer expected) {
	   ProductPage productPage = new ProductPage();
	   String actual = productPage.quantityBox.getAttribute("value");
	    assertEquals(expected.toString(), actual);
		
	}
	
	@Then("I click on {word} button {int} times")
	public void i_click_on_plus_button_times(String word, Integer times) {
	   ProductPage pp = new ProductPage();
	  
	   for (int i = 0; i < times; i++) {
		if(word.equalsIgnoreCase("plus")){
			 pp.plusButton.click();
		}else{
			pp.minusButton.click();
		}
	}
	   	
	   globalTimes = times + 1;
	   
	  
	}

	@Then("The quantity should be correct")
	public void the_quantity_should_be_correct() {
		ProductPage pp = new ProductPage();
		String actual = pp.quantityBox.getAttribute("value");
		assertEquals(globalTimes.toString(), actual);
	}
	
	
	@Given("the first step")
	public void the_first_step() {
	    System.out.println("1");
	}

	@When("I do the second step")
	public void i_do_the_second_step() {
	    System.out.println("2");
	}

	@Then("I verify the third step")
	public void i_verify_the_third_step() {
	    System.out.println("3");

	}@When("I click on Dresses link")
	public void i_click_on_Dresses_link() {
          new HomePage().dressesLink.click();

	}

	@Then("The Casual Dresses subcategory should be displayed")
	public void the_Casual_Dresses_subcategory_should_be_displayed() {
	   dressPage = new DressesPage();
	    
	    
	    assertTrue(dressPage.casualDresses.isDisplayed());
	}
	
	@Then("The following subcategories should be displayed")
	public void the_following_subcategories_should_be_displayed(List<String> subcategories) {
	    dressPage = new DressesPage();

		for (String dress : subcategories) {
			  assertTrue(dressPage.getSubcategory(dress).isDisplayed());
		}
	  
		
		
	}
	
	@Then("The following colors should be displayed")
	public void the_following_colors_should_be_displayed(List<String> colors) {
			dressPage = new DressesPage();
			
			for (String string : colors) {
				
				assertTrue(dressPage.getColorElement(string).isDisplayed());

			}
	}
	
	
	
	@When("I click on {string}")
	public void i_click_on(String product) {
		 HomePage homepage = new HomePage();
		 homepage.getProduct(product).click();
	}

	@Then("The product page should also display {string}")
	public void the_product_page_should_also_display(String expectedName) {
		ProductPage pp = new ProductPage();
		String actualName = pp.productName.getText();
		assertEquals(expectedName, actualName);

	}

	@Then("The product price should be {double}")
	public void the_product_price_should_be(Double expected) {
		ProductPage pp = new ProductPage();
		Double actual = Double.parseDouble(pp.price.getText().substring(1));
		assertEquals(expected, actual);

	}

	
	
		





	
	




	

}

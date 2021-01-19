package io.duotech.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Then;
import io.duotech.pages.HomePage;
import io.duotech.pages.ProductPage;
import io.duotech.utilities.Driver;
import io.duotech.utilities.ExcelUtils;

public class PromotedProductsStepDefs {
	
	
	@Then("The promoted products should be displayed")
	public void the_promoted_products_should_be_displayed() {
		//Get the promoted products from excel file
		//Verify if they are displayed
		HomePage homepage = new HomePage();
		ExcelUtils sheet = new ExcelUtils("src/test/resources/io/duotech/test-data/1.xlsx", "Sheet1");
		
		
		List<Map<String, String>> allRows = sheet.getDataAsList();
		
		
		for (int i = 0; i < allRows.size(); i++) {
			
			  Map<String, String> row = allRows.get(i);
			  
			if(row.get("Execute").equalsIgnoreCase("Y")) {
				String expectedProduct = row.get("Product");
				
				assertTrue(	homepage.getProduct(expectedProduct).isDisplayed()) ;
				
			}  
			  
		}
		


		


	}

	@Then("The details of the product should be correct")
	public void the_details_of_the_product_should_be_correct() {
		
		HomePage homepage = new HomePage();
		ProductPage productPage = new ProductPage();
		ExcelUtils sheet = new ExcelUtils("src/test/resources/io/duotech/test-data/1.xlsx", "Sheet1");
		
		
		List<Map<String, String>> allRows = sheet.getDataAsList();
		
		
		for (int i = 0; i < allRows.size(); i++) {
			
			  Map<String, String> row = allRows.get(i);
			  
			if(row.get("Execute").equalsIgnoreCase("Y")) {
				String expectedProduct = row.get("Product");
				
				homepage.getProduct(expectedProduct).click();
				
				String expectedPrice = row.get("Price");
				String expectedModel = row.get("Model");
				String expectedComposition = row.get("Composition");
				String expectedStyle = row.get("Styles");
				
				String actualPrice = productPage.price.getText();
				String actualModel = productPage.model.getText();
				String actualComposition= productPage.composition.getText();
				String actualStyle = productPage.style.getText();
				
				try {
				assertEquals(expectedPrice, actualPrice);
				assertEquals(expectedModel, actualModel);
				assertEquals(expectedComposition, actualComposition);
				assertEquals(expectedStyle, actualStyle);
				sheet.setCellData("passed", "Status", i+1);
				
				}catch(AssertionError e) {
					e.printStackTrace();
					sheet.setCellData("fail", "Status", i+1);
					
				}
				
				
				Driver.getDriver().navigate().back();
			} else {
				sheet.setCellData("skipped", "Status", i+1);
			} 
			  
		}
		


		
		
		
		
		
		
		
	    
	}

}

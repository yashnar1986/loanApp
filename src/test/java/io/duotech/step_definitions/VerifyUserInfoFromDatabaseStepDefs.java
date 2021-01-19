package io.duotech.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.pages.LoginPage;
import io.duotech.pages.MyAddressPage;
import io.duotech.utilities.DatabaseUtils;

public class VerifyUserInfoFromDatabaseStepDefs {
	
	



	@When("I click on My Address book")
	public void i_click_on_My_Address_book() {
		LoginPage loginPage = new LoginPage();
		loginPage.myAddress.click();
	  
	}

	@Then("The user info related to the email {string} should match the info in the database")
	public void the_user_info_related_to_the_email_should_match_the_info_in_the_database(String string) {
	    
		//Grab info from UI
		
		MyAddressPage myAddPage = new MyAddressPage();
		
		String actualFirstName = myAddPage.firstName.getText();
		String actualLastName =  myAddPage.lastName.getText();
		String actualAddress = myAddPage.address.getText();
		String actualCity = myAddPage.city.getText().replace(",", "");
		String actualState = myAddPage.state.getText();
		String actualZip = myAddPage.zip.getText();
		
		
		List<Map<String, Object>> queryResultMap = DatabaseUtils.getQueryResultMap("select * from users where email = '"+string+"'");
		
		Map<String, Object> row = queryResultMap.get(0);
		
		assertEquals(row.get("first_name"), actualFirstName);
		assertEquals(row.get("last_name"), actualLastName);
		assertEquals(row.get("address"), actualAddress);
		assertEquals(row.get("city"), actualCity);
		assertEquals(row.get("state"), actualState);
		assertEquals(row.get("zip").toString(), actualZip);
		
		
		
		
	}

}

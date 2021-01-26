package io.duotech.step_definitions;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.duotech.pages.HomePage;
import io.duotech.utilities.ConfigReader;
import io.duotech.utilities.Driver;
import io.duotech.utilities.LoggerUtils;

public class MainPageStepDefs {
	
	Logger logger = LoggerUtils.getLogger(MainPageStepDefs.class);
	HomePage hp = new HomePage();
	
	@Given("Client in the home page")
	public void client_in_the_home_page() {
		Driver.getDriver().get(ConfigReader.getConfiguration("url"));
		logger.info("Navigating to a homepage");
	}

	@Then("Verify home page title")
	public void verify_home_page_title() {
		logger.info("Getting the page title");
		String actual = Driver.getDriver().getTitle();
	   String expected = "Login - Loan Application";
	   logger.info("Verifying the title");
	   assertEquals(expected, actual);
	}

}

package io.duotech.step_definitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.When;
import io.duotech.pages.PersonalInfoPage;
import io.duotech.utilities.LoggerUtils;

public class PersonalInfoFillingStepDefs {
	
	Logger logger = LoggerUtils.getLogger(PersonalInfoFillingStepDefs.class);
	PersonalInfoPage pi = new PersonalInfoPage();
	
	@When("Client fills out the personal info details")
	public void client_fills_out_the_personal_info_details() {
		logger.info("Client fills personal info details without co-borrower");
		logger.info("Client entered first name");
		pi.firstNameField.sendKeys("David");
		logger.info("Client entered last name");
		pi.lastNameField.sendKeys("Beckham");
		
	}

}

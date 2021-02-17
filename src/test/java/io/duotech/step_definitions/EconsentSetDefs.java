package io.duotech.step_definitions;

import org.apache.log4j.Logger;

import io.cucumber.java.en.When;
import io.duotech.pages.EconsentPage;
import io.duotech.utilities.LoggerUtils;

public class EconsentSetDefs {
	
	Logger logger = LoggerUtils.getLogger(EconsentSetDefs.class);
	EconsentPage ep = new EconsentPage();
	
	@When("Client agree for econsent")
	public void client_agree_for_econsent() {
	    ep.firstNameField.sendKeys("David");
	    ep.lastNameField.sendKeys("Beckham");
	    ep.emailField.sendKeys("db7@gmail.com");
	    ep.agreeRadio.click();
	    ep.nextButton.click();
	}

}

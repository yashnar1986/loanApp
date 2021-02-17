package io.duotech.step_definitions;


import static org.junit.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.pages.AccountPage;
import io.duotech.pages.PreapprovalPage;
import io.duotech.utilities.LoggerUtils;

public class PreapprovalPageFillingStepDefs {
	
	Logger logger = LoggerUtils.getLogger(PreapprovalPageFillingStepDefs.class);
	PreapprovalPage pp = new PreapprovalPage();
	AccountPage ap = new AccountPage();
	
	@When("Client clicks mortgage application menu")
	public void client_clicks_mortgage_application_menu() {
		logger.info("Client opens the mortgage application");
		ap.mortgageAppMenu.click();
		
//		boolean realtorSelected = appPage.workingWithRealtorNoCheckbox.isSelected();
//		if (realtorSelected != true) {
//			appPage.workingWithRealtorNoCheckbox.click();
//		}
//		boolean officerSelected = appPage.loanOfficerNoCheckbox.isSelected();
//		if (officerSelected != true) {
//			appPage.loanOfficerNoCheckbox.click();
//		}
		
	}
	
	@When("Client fills out the preapproval details")
	public void client_fills_out_the_preapproval_details() {
		logger.info("Client fills preapproval details with realtor and loan officer");
		logger.info("Client entered realtor details");
		pp.realtorInfoField.sendKeys("Lana Realty Co, 718-000-0001, lanarealty@gmail.com");
		logger.info("Client fills estimated home price field");
		pp.estimatedHomePriceField.sendKeys("1000000");
		logger.info("Clients down payment amount");
		pp.downPaymentField.sendKeys("100000");
		logger.info("Client chooses down payment source");
		Select sel = new Select(pp.downPaymentSource);
		sel.selectByValue("Equity on Pending Sale (executed sales contract)");
		logger.info("Clients additional founds");
		pp.additionalFundsField.sendKeys("Saving account in foreign country");
		logger.info("Clients clicks next button");
		pp.nextButton.click();
	}

	@Then("Clients application should be successfully submitted")
	public void clients_application_should_be_successfully_submitted() {
	    String actual = pp.succesAlert.getText();
	    String expected = "Application Submiited Successfully";
	    assertEquals(expected, actual);
	}

}

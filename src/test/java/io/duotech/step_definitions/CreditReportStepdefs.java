package io.duotech.step_definitions;

import org.apache.log4j.Logger;

import io.cucumber.java.en.When;
import io.duotech.pages.CreditReportPage;
import io.duotech.utilities.LoggerUtils;

public class CreditReportStepdefs {
	
	Logger logger = LoggerUtils.getLogger(CreditReportStepdefs.class);
	CreditReportPage cr = new CreditReportPage();
	
	@When("Client ordered credit report")
	public void client_ordered_credit_report() {
	   // cr.creditReportYesCheckBox.click();
	    cr.nextButton.click();
	}
}

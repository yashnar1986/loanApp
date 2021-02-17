package io.duotech.step_definitions;

import org.apache.log4j.Logger;

import io.cucumber.java.en.When;
import io.duotech.pages.SummaryPage;
import io.duotech.utilities.LoggerUtils;

public class SummaryStepDefs {
	
	Logger logger = LoggerUtils.getLogger(SummaryStepDefs.class);
	SummaryPage sp = new SummaryPage();
	
	@When("Client review the summary and submit the application")
	public void client_review_the_summary_and_submit_the_application() {
	    sp.saveButton.click();
	}

}

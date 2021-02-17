package io.duotech.step_definitions;

import org.apache.log4j.Logger;

import io.cucumber.java.en.When;
import io.duotech.pages.ExpensesPage;
import io.duotech.utilities.LoggerUtils;

public class ExpensesPageStepDefs {
	
	Logger logger = LoggerUtils.getLogger(ExpensesPageStepDefs.class);
	ExpensesPage ep = new ExpensesPage();
	
	@When("Client fills out the expenses page")
	public void client_fills_out_the_expenses_page() {
	    ep.monthlyrentalpaymentField.sendKeys("25000");
	    ep.nextButton.click();

	}
}

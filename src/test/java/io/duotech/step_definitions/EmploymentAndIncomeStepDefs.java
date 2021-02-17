package io.duotech.step_definitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.When;
import io.duotech.pages.EmployeeAndIncomePage;
import io.duotech.utilities.LoggerUtils;

public class EmploymentAndIncomeStepDefs {
	
	Logger logger = LoggerUtils.getLogger(EmploymentAndIncomeStepDefs.class);
	EmployeeAndIncomePage ei = new EmployeeAndIncomePage();
	
	@When("Client fills out the employment and income details")
	public void client_fills_out_the_employment_and_income_details() {
	    ei.employerName1Field.sendKeys("Los Angeles Galaxy");
	    ei.position1Field.sendKeys("Midfielder");
	    ei.city1Field.sendKeys("Los Angeles");
	    Select s = new Select(ei.state1Select);
	    s.selectByVisibleText("AK");
	    ei.start_date1Field.sendKeys("01012013");
	    ei.grossMonthlyIncomeField.sendKeys("7000");
	    ei.nextButton.click();
	    
	}
	

}

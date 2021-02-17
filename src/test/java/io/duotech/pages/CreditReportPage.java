package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class CreditReportPage {
	
	public CreditReportPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "creditreport1")
	public WebElement creditReportYesCheckBox;
	
	@FindBy (id = "creditreport2")
	public WebElement creditReportNoCheckBox;
	
	@FindBy (linkText = "Next")
	public WebElement nextButton;
	
	@FindBy (linkText = "Previous")
	public WebElement previousButton;

}

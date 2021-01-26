package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class PreapprovalPage {
	
	public PreapprovalPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//label[@for='realtor2']")
	public WebElement workingWithRealtorNoCheckbox;
	
	@FindBy (id = "realtorinfo")
	public WebElement realtorInfoField;
	
	@FindBy (xpath = "//label[@for='loanofficer2']")
	public WebElement loanOfficerNoCheckbox;
	
	@FindBy (id = "estimatedprice")
	public WebElement estimatedHomePriceField;
	
	@FindBy (id = "downpayment")
	public WebElement downPaymentField;
	
	@FindBy (xpath = "//select[@name='src_down_payment']")
	public WebElement downPaymentSource;
	
	@FindBy (id = "additionalfunds")
	public WebElement additionalFundsField;
	
	@FindBy (linkText = "Next")
	public WebElement nextButton;

}

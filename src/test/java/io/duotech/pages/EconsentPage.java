package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class EconsentPage {
	
	public EconsentPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "eConsentdeclarerFirstName")
	public WebElement firstNameField;
	
	@FindBy (id = "eConsentdeclarerLastName")
	public WebElement lastNameField;
	
	@FindBy (id = "eConsentdeclarerEmail")
	public WebElement emailField;
	
	@FindBy (xpath = "//label[@for='agree']")
	public WebElement agreeRadio;
	
	@FindBy (id = "dontagree")
	public WebElement dontAgreeRadio;
	
	@FindBy (linkText = "Next")
	public WebElement nextButton;
	
	@FindBy (linkText = "Previous")
	public WebElement previousButton;
	
	

}

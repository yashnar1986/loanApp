package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class ExpensesPage {
	
	public ExpensesPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "expense2")
	public WebElement ownCheckBox;
	
	@FindBy (id = "monthlyrentalpayment")
	public WebElement monthlyrentalpaymentField;
	
	@FindBy (id = "monthlyrentalpayment-error")
	public WebElement monthlyrentalpaymentFieldErrorMsg;
	
	@FindBy (linkText = "Next")
	public WebElement nextButton;
	
	@FindBy (linkText = "Previous")
	public WebElement previousButton;

}

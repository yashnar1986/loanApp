package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class SummaryPage {
	
	public SummaryPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "PreApprovalEdit")
	public WebElement preApprovalEditBtn;
	
	@FindBy (id = "PersonalnformationEdit")
	public WebElement personalnformationEditBtn;
	
	@FindBy (id = "ExpenseEdit")
	public WebElement expenseEditBtn;
	
	@FindBy (id = "EmploymentIncomeEdit")
	public WebElement employmentIncomeEditBtn;
	
	@FindBy (id = "eConsentEdit")
	public WebElement eConsentEditBtn;
	
	
	@FindBy (linkText = "Save")
	public WebElement saveButton;
	
	@FindBy (linkText = "Previous")
	public WebElement previousButton;

}

package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class EmployeeAndIncomePage {
	
	public EmployeeAndIncomePage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (partialLinkText = "employer1")
	public WebElement employer1Window;
	
	@FindBy (id = "clear1")
	public WebElement clear1Btn;
	
	@FindBy (xpath = "//button[.='Yes!']")
	public WebElement AlertYesBtn;
	
	@FindBy (xpath = "//button[.='Cancel']")
	public WebElement AlertCancelBtn;
	
	@FindBy (id = "remove2")
	public WebElement remove2Btn;
	
	@FindBy (id = "currentjob1")
	public WebElement currentjob1CheckBox;
	
	@FindBy (id = "employername1")
	public WebElement employerName1Field;
	
	@FindBy (id = "position1")
	public WebElement position1Field;
	
	@FindBy (id = "city")
	public WebElement city1Field;
	
	@FindBy (id = "state1")
	public WebElement state1Select;
	
	@FindBy (id = "start_date1")
	public WebElement start_date1Field;
	
	@FindBy (id = "end_date1")
	public WebElement end_date1Field;
	
	@FindBy (id = "employername2")
	public WebElement employerName2Field;
	
	@FindBy (id = "position2")
	public WebElement position2Field;
	
	@FindBy (id = "city2")
	public WebElement city2Field;
	
	@FindBy (id = "state2")
	public WebElement state2Select;
	
	@FindBy (id = "start_date2")
	public WebElement start_date2Field;
	
	@FindBy (id = "end_date2")
	public WebElement end_date2Field;
	
	@FindBy (id = "grossmonthlyincome")
	public WebElement grossMonthlyIncomeField;
	
	@FindBy (id = "monthlyovertime")
	public WebElement monthlyOverTimeField;
	
	@FindBy (id = "monthlybonuses")
	public WebElement monthlyBonusesField;
	
	@FindBy (id = "monthlycommission")
	public WebElement monthlyCommissionField;
	
	@FindBy (id = "monthlydividents")
	public WebElement monthlyDividentsField;
	
	@FindBy (id = "incomesource1")
	public WebElement incomesource1Select;
	
	@FindBy (id = "amount1")
	public WebElement amount1Field;
	
	@FindBy (id = "incomesource2")
	public WebElement incomesource2Select;
	
	@FindBy (id = "amount2")
	public WebElement amount2Field;
	
	@FindBy (id = "incomesource3")
	public WebElement incomesource3Select;
	
	@FindBy (id = "amount3")
	public WebElement amount3Field;
	
	@FindBy (linkText = "Next")
	public WebElement nextButton;
	
	@FindBy (linkText = "Previous")
	public WebElement previousButton;

}

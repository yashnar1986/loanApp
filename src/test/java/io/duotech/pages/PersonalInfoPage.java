package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class PersonalInfoPage {
	
	public PersonalInfoPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//label[@for='coborrower1']")
	public WebElement coBorrowerYesCheckbox;
	
	@FindBy (xpath = "//label[@for='privacypolicy']")
	public WebElement privacypolicyNoCheckbox;
	
	@FindBy (id = "b_firstName")
	public WebElement firstNameField;
	
	@FindBy (id = "b_middleName")
	public WebElement middleNameField;
	
	@FindBy (id = "b_lastName")
	public WebElement lastNameField;
	
	@FindBy (id = "b_suffix")
	public WebElement suffixDropDown;
	
	@FindBy (id = "b_email")
	public WebElement emailField;
	
	@FindBy (id = "b_dob")
	public WebElement dobField;
	
	@FindBy (id = "b_ssn")
	public WebElement ssnField;
	
	@FindBy (id = "b_cell")
	public WebElement cellPhoneField;
	
	@FindBy (id = "b_marital")
	public WebElement maritalStatusDropDown;
	
	@FindBy (id = "b_home")
	public WebElement homePhoneField;
	
	@FindBy (id = "c_firstName")
	public WebElement firstNameCoBorrowerField;
	
	@FindBy (id = "c_middleName")
	public WebElement middleNameCoBorrowerField;
	
	@FindBy (id = "c_lastName")
	public WebElement lastNameCoBorrowerField;
	
	@FindBy (id = "c_suffix")
	public WebElement suffixCoBorrowerDropDown;
	
	@FindBy (id = "c_email")
	public WebElement emailCoBorrowerField;
	
	@FindBy (id = "c_dob")
	public WebElement dobCoBorrowerField;
	
	@FindBy (id = "c_ssn")
	public WebElement ssnCoBorrowerField;
	
	@FindBy (id = "c_cell")
	public WebElement cellPhoneCoBorrowerField;
	
	@FindBy (id = "c_marital")
	public WebElement maritalStatusCoBorrowerDropDown;
	
	@FindBy (id = "c_home")
	public WebElement homePhoneCoBorrowerField;
	
	@FindBy (linkText = "Next")
	public WebElement nextButton;
	
	@FindBy (linkText = "Previous")
	public WebElement previousButton;
	
	
	
	

}

package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class RegisterPage {
	
	public RegisterPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "inputfirstname4")
	public WebElement firstNameInput;
	
	@FindBy (id = "inputlastname4")
	public WebElement lastNameInput;
	
	@FindBy (id = "email")
	public WebElement emailInput;
	
	@FindBy (id = "exampleInputPassword1")
	public WebElement PasswordInput;
	
	@FindBy (id = "register")
	public WebElement registerButton;

}

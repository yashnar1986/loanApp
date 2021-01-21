package io.duotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class HomePage {
	
	
	public HomePage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (linkText = "Sign up")
	public WebElement signUpLink;
	
	@FindBy (id = "exampleInputEmail1")
	public WebElement emailField;

	@FindBy (id = "exampleInputPassword1")
	public WebElement passwordField;
	
	@FindBy (name = "login")
	public WebElement loginButton;

}

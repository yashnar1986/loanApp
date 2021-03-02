package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class AccountPage {
	
	public AccountPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//span[@class='user-name']")
	public WebElement accountHolderName;
	
	@FindBy (xpath = "//span[.='Mortgage Application']")
	public WebElement mortgageAppMenu;
	
	@FindBy (xpath = "//span[.='Application List']")
	public WebElement appListMenu;
	
	
	
	

}

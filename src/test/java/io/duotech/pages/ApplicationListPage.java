package io.duotech.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class ApplicationListPage {
	
	public ApplicationListPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//h4[.=' Application List']")
	public WebElement appListMenuHeader; // to get text use trim
	
	@FindBy (xpath = "//select[@name='DataTables_Table_0_length']")
	public WebElement selectEntries;
	
	@FindBy (xpath = "//a[@href='mortagageloandegtails.php?id=248']")
	public WebElement viewApplicationDetail;
	
	public WebElement getViewApplicationDetailViaID(String id) {
		String customXpath = "//a[@href='mortagageloandegtails.php?id=" + id + "']";
		return Driver.getDriver().findElement(By.xpath(customXpath));
	}
	
	@FindBy (tagName = "td")
	public List<WebElement> AllInfoTable;
	
	@FindBy (xpath = "//table[@class='table ']")
	public List<WebElement> PreApprovalInfoTable;
	
	@FindBy (xpath = "//table[@class='table'][1]")
	public List<WebElement> BorrowerInfoTable;
	
	@FindBy (xpath = "//table[@class='table'][2]")
	public List<WebElement> ExpensesInfoTable;
	
	@FindBy (xpath = "//table[@class='table'][3]")
	public List<WebElement> BorrowerEmploymentInfoTable;
	
	@FindBy (xpath = "//table[@class='table'][4]")
	public List<WebElement> BorrowerIncomeInfoTable;
	
	@FindBy (xpath = "//table[@class='table'][5]")
	public List<WebElement> AdditionalIncomeInfoTable;
	
	@FindBy (xpath = "//table[@class='table'][6]")
	public List<WebElement> econsentInfoTable;
	
	
	
	

}

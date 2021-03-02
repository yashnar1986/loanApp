package io.duotech.step_definitions;

import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.pages.AccountPage;
import io.duotech.pages.ApplicationListPage;
import io.duotech.utilities.DatabaseUtils;
import io.duotech.utilities.LoggerUtils;

public class VerifyAppDetailsStepDefs {
	
	Logger logger = LoggerUtils.getLogger(VerifyAppDetailsStepDefs.class);
	AccountPage ap = new AccountPage();
	ApplicationListPage al = new ApplicationListPage();
	String actual ="";
	String expected ="";
	
	@Given("Client clicks Application List menu")
	public void client_clicks_Application_List_menu() {
	    ap.appListMenu.click();
	    actual = al.appListMenuHeader.getText().trim();
	    expected = "Application List";
	    assertEquals(expected, actual);
	}
	
	@When("Client clicks View Details button")
	public void client_clicks_View_Details_button(String id) {
	
		al.getViewApplicationDetailViaID(id).click();
//		List<WebElement> list = al.AllInfoTable;
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("" + i +" "+ list.get(i).getText());
//		}
		}

	@Then("Client should be able to verify application details")
	public void client_should_be_able_to_verify_application_details(String id) {
		List<Map<String, Object>> queryResultMap = DatabaseUtils.getQueryResultMap(
				"select * from tbl_mortagage where id = '"+id+"';");
		Map<String, Object> row = queryResultMap.get(0);
		actual = row.get("b_email").toString();
		expected = al.AllInfoTable.get(12).getText();
		assertEquals(expected, actual);
		actual = row.get("b_firstName").toString();
		expected = al.AllInfoTable.get(42).getText();
		assertEquals(expected, actual);
		actual = row.get("b_lastName").toString();
		expected = al.AllInfoTable.get(43).getText();
		assertEquals(expected, actual);
	}

}

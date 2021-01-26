package io.duotech.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.pages.AccountPage;
import io.duotech.pages.HomePage;
import io.duotech.pages.RegisterPage;
import io.duotech.utilities.ConfigReader;
import io.duotech.utilities.DatabaseUtils;
import io.duotech.utilities.Driver;
import io.duotech.utilities.ExcelUtils;
import io.duotech.utilities.LoggerUtils;

public class LoginStepDefs {

	Logger logger = LoggerUtils.getLogger(LoginStepDefs.class);
	HomePage hp = new HomePage();
	RegisterPage rp = new RegisterPage();
	AccountPage ap = new AccountPage();

	@Then("Client should be get error message")
	public void client_should_be_get_error_message() {

		logger.info("Client gets error message");
		String actual = rp.emailUsedText.getText();
		String expected = "This email already used";
		logger.info("Verify error message");
		assertEquals(expected, actual);

	}

	@When("Client enters first name {string}")
	public void client_enters_first_name(String fname) {

		logger.info("Client entered first name " + fname);
		rp.firstNameInput.sendKeys(fname);
	}

	@When("Client enters last name {string}")
	public void client_enters_last_name(String lname) {

		logger.info("Client entered last name " + lname);
		rp.lastNameInput.sendKeys(lname);
	}

	@When("Client enters email address {string}")
	public void client_enters_email_address(String email) {

		logger.info("Client entered valid email " + email);
		rp.emailInput.sendKeys(email);
	}

	@When("Client enters password {string}")
	public void client_enters_password(String password) {

		logger.info("Client entered password " + password);
		rp.PasswordInput.sendKeys(password);
	}

	@When("Client enters valid email and password")
	public void client_enters_valid_email_and_password() {

		logger.info("Client enters valid email");
		hp.emailField.sendKeys("db7@gmail.com");
		logger.info("Client enters valid password");
		hp.passwordField.sendKeys("David723");
	}

	@When("Client clicks login button")
	public void client_clicks_login_button() {

		logger.info("Client clicks login button");
		hp.loginButton.click();
	}

	@Then("Client should be able to enter to his account page")
	public void client_should_be_able_to_enter_to_his_account_page() {

		logger.info("Client account page opens");
		String actual = ap.accountHolderName.getText();
		String expected = "David Beckham";
		logger.info("Verifying name of acoount holder");
		assertEquals(expected, actual);
		
	}

	@When("Client enters valid email {string} and password {string}")
	public void client_enters_valid_email_and_password(String email, String password) {
		logger.info("Client enters valid email");
		hp.emailField.sendKeys(email);
		logger.info("Client enters valid password");
		hp.passwordField.sendKeys(password);

	}

	@Then("Clients first name {string} and last name {string} should displaed on his account page")
	public void clients_first_name_and_last_name_should_displaed_on_his_account_page(String firs_name,
			String last_name) {
		logger.info("Client account page opens");
		String actual = ap.accountHolderName.getText();
		List<Map<String, Object>> queryResultMap = DatabaseUtils.getQueryResultMap(
				"select * from tbl_user where first_name = '" + firs_name + "' and last_name = '" + last_name + "';");

		Map<String, Object> row = queryResultMap.get(0);
		String fn = row.get("first_name").toString();
		String ln = row.get("last_name").toString();
		String fullname = fn + " " + ln;
		logger.info("Verifying name of acoount holder with data base");
		assertEquals(fullname, actual);

	}

}

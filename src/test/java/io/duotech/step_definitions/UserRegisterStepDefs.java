package io.duotech.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.pages.AccountPage;
import io.duotech.pages.HomePage;
import io.duotech.pages.RegisterPage;
import io.duotech.utilities.Driver;
import io.duotech.utilities.ExcelUtils;
import io.duotech.utilities.LoggerUtils;

public class UserRegisterStepDefs {

	Logger logger = LoggerUtils.getLogger(UserRegisterStepDefs.class);
	HomePage hp = new HomePage();
	RegisterPage rp = new RegisterPage();
	AccountPage ap = new AccountPage();

	@When("Client click the Sign up button")
	public void client_click_the_Sign_up_button() {

		logger.info("Client clicks the Sign Up Link");
		hp.signUpLink.click();
	}

	@Then("Page title should be Register - Create an Account")
	public void page_title_should_be_Register_Create_an_Account() {
		logger.info("Getting the page title");
		String actual = Driver.getDriver().getTitle();
		String expected = "Register - Create an Account";
		assertEquals(expected, actual);
		logger.info("Verifying the title");
	}

	@When("Client will fill out the sign up form")
	public void client_will_fill_out_the_sign_up_form() {

		logger.info("Client entered first name");
		rp.firstNameInput.sendKeys("David");
		logger.info("Client entered last name");
		rp.lastNameInput.sendKeys("Beckham");
		logger.info("Client entered valid email");
		rp.emailInput.sendKeys("db7@gmail.com");
		logger.info("Client entered password");
		rp.PasswordInput.sendKeys("David723");

	}

	@When("Client clicks the Sign up button")
	public void client_clicks_the_Sign_up_button() {

		logger.info("Client clicks the sign up button");
		rp.registerButton.click();
	}

	@Then("Client should be successfully registered")
	public void client_should_be_successfully_registered() {
		System.out.println("SUCCSSES");
	}

	@When("Client will fill out the sign up form by using excel")
	public void client_will_fill_out_the_sign_up_form_by_using_excel() throws InterruptedException {
		ExcelUtils sheet = new ExcelUtils("Data.xlsx", "sheet1");
		List<Map<String, String>> allRows = sheet.getDataAsList();
		for (int i = 0; i < allRows.size(); i++) {

			Map<String, String> row = allRows.get(i);

			logger.info("Client entered first name");
			rp.firstNameInput.sendKeys(row.get("first name"));
			logger.info("Client entered last name");
			rp.lastNameInput.sendKeys(row.get("last name"));
			logger.info("Client entered valid email");
			rp.emailInput.sendKeys(row.get("email address"));
			logger.info("Client entered password");
			rp.PasswordInput.sendKeys(row.get("password"));
			logger.info("Client clicks the sign up button");
			rp.registerButton.click();
			System.out.println("SUCCSSES");
			Thread.sleep(2000);
			Driver.getDriver().navigate().back();
			Thread.sleep(2000);
			hp.signUpLink.click();
			Thread.sleep(2000);

		}
	}

}

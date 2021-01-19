package io.duotech.step_definitions;



import org.apache.log4j.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.pages.HomePage;
import io.duotech.pages.RegisterPage;
import io.duotech.utilities.ConfigReader;
import io.duotech.utilities.Driver;
import io.duotech.utilities.LoggerUtils;


public class LoginStepDefs {
	
	
Logger logger = LoggerUtils.getLogger(LoginStepDefs.class);
	
	@Given("Client in the home page")
	public void client_in_the_home_page() {
		Driver.getDriver().get(ConfigReader.getConfiguration("url"));
		logger.info("Navigating to a homepage");
	}

	@Then("Verify home page title")
	public void verify_home_page_title() {
		logger.info("Getting the page title");
		String actual = Driver.getDriver().getTitle();
	   String expected = "Login - Loan Application";
	   logger.info("Verifying the title");
	}
	
	@When("Client click the Sign up button")
	public void client_click_the_Sign_up_button() {
		HomePage hp = new HomePage();
	    logger.info("Client clicks the Sign Up Link");
	    hp.signUpLink.click();
	}

	@Then("Page title should be Register - Create an Account")
	public void page_title_should_be_Register_Create_an_Account() {
		logger.info("Getting the page title");
		String actual = Driver.getDriver().getTitle();
	   String expected = "Register - Create an Account";
	   logger.info("Verifying the title");
	}
	
	@When("Client will fill out the sign up form")
	public void client_will_fill_out_the_sign_up_form() {
		RegisterPage rp = new RegisterPage();
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
		RegisterPage rp = new RegisterPage();
		logger.info("Client clicks the sign up button");
		rp.registerButton.click();
	}

	@Then("Client should be successfully registered")
	public void client_should_be_successfully_registered() {
	    System.out.println("SUCCSSES");
	}
	
	

		


}

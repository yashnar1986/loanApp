package io.duotech.step_definitions;



import org.apache.log4j.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.pages.AccountPage;
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
	
	
	@Then("Client should be get error message")
	public void client_should_be_get_error_message() {
		RegisterPage rp = new RegisterPage();
		logger.info("Client gets error message");
		String actual = rp.emailUsedText.getText();
		String expected = "This email already used";
	}
	
	@When("Client enters first name {string}")
	public void client_enters_first_name(String fname) {
		RegisterPage rp = new RegisterPage();
		logger.info("Client entered first name " + fname);
		rp.firstNameInput.sendKeys(fname);
	}
		
	@When("Client enters last name {string}")
	public void client_enters_last_name(String lname) {
		RegisterPage rp = new RegisterPage();
		logger.info("Client entered last name " + lname);
		rp.lastNameInput.sendKeys(lname);
	}

	@When("Client enters email address {string}")
	public void client_enters_email_address(String email) {
		RegisterPage rp = new RegisterPage();
		logger.info("Client entered valid email " + email);
		rp.emailInput.sendKeys(email);
	}

	@When("Client enters password {string}")
	public void client_enters_password(String password) {
		RegisterPage rp = new RegisterPage();
		logger.info("Client entered password " + password);
		rp.PasswordInput.sendKeys(password);
	}
	
	@When("Client enters valid email and password")
	public void client_enters_valid_email_and_password() {
		HomePage hp = new HomePage();
	    logger.info("Client enters valid email");
	    hp.emailField.sendKeys("db7@gmail.com");
	    logger.info("Client enters valid password");
	    hp.passwordField.sendKeys("David723");
	}

	@When("Client clicks login button")
	public void client_clicks_login_button() {
		HomePage hp = new HomePage();
	    logger.info("Client clicks login button");
	    hp.loginButton.click();
	}

	@Then("Client should be able to enter to his account page")
	public void client_should_be_able_to_enter_to_his_account_page() {
	    AccountPage ap = new AccountPage();
	    logger.info("Client account page opens");
	    String actual = ap.accountHolderName.getText();
		String expected = "David Beckham";
		logger.info("Verifying name of acoount holder");
		ap.mortgageAppMenu.click();
		ap.workingWithRealtorCheckbox.click();
	    
	}

}

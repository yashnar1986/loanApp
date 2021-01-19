Feature: Login functionality
  
  
  Scenario: Verify Home page
    Given Client in the home page
    Then Verify home page title
    

	Scenario: Navigate to Sign Up page
    Given Client in the home page
    When Client click the Sign up button
    Then Page title should be Register - Create an Account


	Scenario: Register new user
    Given Client in the home page
    When Client click the Sign up button
    And Client will fill out the sign up form
    And Client clicks the Sign up button
    Then Client should be successfully registered
    
   
	Scenario: Register existing user
    Given Client in the home page
    When Client click the Sign up button
    And Client will fill out the sign up form
    And Client clicks the Sign up button
    Then Client should be get error message
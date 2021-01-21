Feature: Login functionality
  
  
  Scenario: Verify Home page
    Given Client in the home page
    Then Verify home page title
    

	Scenario: Navigate to Sign Up page
    Given Client in the home page
    When Client click the Sign up button
    Then Page title should be Register - Create an Account
    
    @loan
    Scenario: Check login functionality with valid credentionals
    Given Client in the home page
    When Client enters valid email and password
    And Client clicks login button 
		Then Client should be able to enter to his account page

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
    
    
    Scenario Outline: Regiter new user by using Scenario Outline
			
			Given Client in the home page
    	When Client click the Sign up button
			And Client enters first name "<first name>"
			And Client enters last name "<last name>"
			And Client enters email address "<email address>"
			And Client enters password "<password>"
			And Client clicks the Sign up button
			Then Client should be successfully registered
			Examples:
			 	|first name	|last name  |email address  |password   |
			  |Peter			|Schmeichel |psh1@gmail.com	|manutd1999 |
			  |Gary       |Neville 		|gn2@gmail.com  |manutd1999 |
			  |Poul       |Scholes 		|ps18@gmail.com |manutd1999 |
			  |Andy       |Cole 			|ac9@gmail.com  |manutd1999 | 
			  |Dwight     |York 			|dy19@gmail.com |manutd1999 |
			  
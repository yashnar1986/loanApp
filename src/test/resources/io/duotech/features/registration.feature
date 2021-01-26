@register
Feature: User Registration Functionality

  Background: 
    Given Client in the home page
    When Client click the Sign up button

  Scenario: Navigate to Sign Up page
    Then Page title should be Register - Create an Account

  Scenario: Register new user
    And Client will fill out the sign up form
    And Client clicks the Sign up button
    Then Client should be successfully registered

  Scenario: Register new user by using excel data
    And Client will fill out the sign up form by using excel

  Scenario: Register existing user
    And Client will fill out the sign up form
    And Client clicks the Sign up button
    Then Client should be get error message

  Scenario Outline: Regiter new user by using Scenario Outline
    And Client enters first name "<first name>"
    And Client enters last name "<last name>"
    And Client enters email address "<email address>"
    And Client enters password "<password>"
    And Client clicks the Sign up button
    Then Client should be successfully registered

    Examples: 
      | first name | last name  | email address  | password   |
      | Peter      | Schmeichel | psh1@gmail.com | manutd1999 |
      | Gary       | Neville    | gn2@gmail.com  | manutd1999 |
      | Poul       | Scholes    | ps18@gmail.com | manutd1999 |
      | Andy       | Cole       | ac9@gmail.com  | manutd1999 |
      | Dwight     | York       | dy19@gmail.com | manutd1999 |

@login
Feature: Login functionality

  Background: Verify Home page
    Given Client in the home page

  
  Scenario: Check login functionality with valid credentionals
    When Client enters valid email and password
    And Client clicks login button
    Then Client should be able to enter to his account page
 @db
  Scenario: Check login functionality with valid credentionals and verify with DB
    When Client enters valid email "db7@gmail.com" and password "David723"
    And Client clicks login button
    Then Clients first name "David" and last name "Beckham" should displaed on his account page
 @db
  Scenario Outline: Check login functionality with valid credentionals and verify with DB via DDT
    When Client enters valid email "<email address>" and password "<password>"
    And Client clicks login button
    Then Clients first name "<first name>" and last name "<last name>" should displaed on his account page

    Examples: 
      | first name | last name  | email address  | password   |
      | Peter      | Schmeichel | psh1@gmail.com | manutd1999 |
      | Gary       | Neville    | gn2@gmail.com  | manutd1999 |
      | Poul       | Scholes    | ps18@gmail.com | manutd1999 |
      | Andy       | Cole       | ac9@gmail.com  | manutd1999 |
      | Dwight     | York       | dy19@gmail.com | manutd1999 |


Feature: Verify Application Details from DB

Background: Login with valid credentionals
    Given Client in the home page
    When Client enters valid email and password
    And Client clicks login button

  
  Scenario: Verify application details accuracy with DB data
    Given Client clicks Application List menu
    When Client clicks View Details button	
    			|245|
    Then Client should be able to verify application details
    			|245|

  
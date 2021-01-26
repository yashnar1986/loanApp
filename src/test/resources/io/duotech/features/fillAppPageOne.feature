Feature: Filling Application Functionality

  Background: Login with valid credentionals
    Given Client in the home page
    When Client enters valid email and password
    And Client clicks login button
    And Client clicks mortgage application menu

  @loan
  Scenario: Client fills Preapproval Details page with realtor and officer
    And Client fills out the preapproval details
    And Client fills out the personal info details
    Then Clint clicks next button

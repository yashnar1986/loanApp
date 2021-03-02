
@api
Feature: Loan App API functionality.

  
  Scenario: Register new user via API
    Given Body details of API request
    When User sends post request
    Then API response message should be "This E-mail already in use!" and status code "422"
  

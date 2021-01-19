Feature: Login functionality using datatables
		
		Background: 
			Given I am on the homepage
			When I click on Sign in



Scenario: Verify positive login using DataTable
			
			And I enter the following credentials, I should be able to login
					|duotech@gmail.com  | dt123      |
					|dt2020@gmail.com   | dt123      |
					|akmaldt@gmail.com  | dt123      |
					|duotech1@gmail.com | duotech1   |
					|duotech2@gmail.com | duotech22  |
					|duotech3@gmail.com | duotech333 |
			
		
		Scenario: Verify user registration
			
			
			And I enter valid email and click Create Account
			And I should be able to pass the following data and click on register and see the name
					|First Name  | Last Name  | Address            | Password | City   |  Zip  |  Phone     |
					|John        | Smith      | 8133 Leesburg Pike | dt12345  | Vienna | 22812 | 2021234567 |
				
					
	
Feature: Product description
		
		
@logging
		Scenario: Verify product name 
		
			Given I am on the homepage
			When I click on Blouse
			Then The product page should also display Blouse
		
		
	
		Scenario: Verify default product quantity
		
			Given I am on the homepage
			When I click on Blouse
			Then I land on product page
			And The default quantity for the product should be 1
			

			
	
		
	
		Scenario: Verify plus and minus buttons
		
			Given I am on the homepage
			When I click on Blouse
			And I land on product page
			When I click on plus button 10 times
			Then The quantity should be correct
			And I click on minus button 5 times
			Then The quantity should be correct
			

 Scenario: Verify product name 
	
			
			When I click on "Blouse"
			Then The product page should also display "Blouse"
			And  The product price should be 27.00
			
		
	
			

			
			
		
			
			
			
		
		

		
		
		
			
		
		
		
		

 
Feature: Product info verification using datables

	#Implementing a scenario without using DataTable
		
		Scenario: Verify Dress page subcategories
		
					Given I am on the homepage
					When I click on Dresses link
					Then The Casual Dresses subcategory should be displayed
					
					
		#Implementing a scenario without using DataTable
		
		
		Scenario: Verify Dress page subcategories
		
					Given I am on the homepage
								
					When I click on Dresses link
							
					Then The following subcategories should be displayed
								| Casual Dresses |
								| Evening Dresses|
								| Summer Dresses |
					
			
		Scenario: Verify Dress page colors
		
					Given I am on the homepage
								
					When I click on Dresses link
							
					Then The following colors should be displayed
								| Beige  |
								| Black  |
								| Blue   |
								| Yellow |
								| White  |
								| Orange |
								| Green  |
		            | Pink   |
		
Feature: User registration 


Scenario Outline: Verify multiple user registration
	
			Given I am on the homepage
			When I click on Sign in
			And I enter valid email and click Create Account
			And I should be able to pass the following data and click on register and see the name
					|First Name          | Last Name        | Address   | Password | City   |  Zip  |  Phone     |
					|<first name>      | <last name>      | <address> | dt12345  | <city> | <zip> |  <phone>   |
					
				
				Examples:
				| first name | last name     |   address                 |   city            |   zip           |   phone         |
				|Ruddy       |Dugget         | 35288 Mitchell Street     | Tariport          | 33447           | 934.720.1036    |
        |Gwendolen   |Daniele        | 2949 Novick Avenue        | Lake Jessie       | 41651           | 274-065-1999    |
				|Ddene       |Manicomb       | 5321 Browning Parkway     | North Cameronland | 31968           | 606-580-9439    |
				|Lynett      |Coulston       | 642 West Street           | East Kirsten      | 10830           | 329-578-6017    |
				|Had         |Paddemore      | 568 Fair Oaks Avenue      | Chimouth          | 35994           | 408.132.1237    |
				|Dionysus    |Klossek        | 60 Harbort Way            | East Darrickfort  | 46836           | 779-494-5333    |
				|Ingrim      |Millett        | 7545 Birchwood Center     | Benbury           | 89089           | 560-330-7342    |
				|Boycie      |Dorkin         | 17722 Sommers Pass        | Gaylordshire      | 56415           | 934.720.1036    |
				|Chico       |Hargitt        | 56749 Bay Lane            | North Royce       | 42098           | 274-065-1999    |
				|Michale     |Spearett       | 182 Myrtle Lane           | South Bongbury    | 23575           | 606-580-9439    |
				|Hashim      |Kindleside     | 3 Dayton Alley            | South Dustin      | 75287           | 329-578-6017    |
				|Ralina      |Rapinett       | 8578 Cody Crossing        | Bayerland         | 45276           | 408.132.1237    |
				|Hew         |Jerzyk         | 93 Pepper Wood Park       | West Monty        | 36804           | 779-494-5333    |
				|Krissie     |Rickell        | 35724 Anthes Plaza        | East Keeleyside   | 27197           | 560-330-7342    |
				|Jilleen     |O'Cosgra       | 56 Mayer Park             | Mohrside          | 82727           | 613.138.9560    |
					     
					     
					     
Feature: Search and Place Order For Products


@OffersPage
Scenario Outline: Search experience for product in both home and offers page

	Given User is on GreenKart landing page
	When user searched with shortname <Name> and extract actual name of the product
	And user search for the <Name> shortname in offers page
	Then validate product name in offers page matches with landing page
	
	Examples:
		|	Name	|
		|	Tom		|
		|	Beet	|
Feature: Checkout Selected Product


@PlaceOrder
Scenario Outline: Checkout the selected number of product

	Given User is on GreenKart landing page
	When user searched with shortname <Name> and extract actual name of the product
	And added "3" items of the selected product to cart
	Then user proceeds to checkout and validate the <Name> items in checkout page
	And verify user has ability to enter promo code and place the order
	
	
	Examples:
		|	Name	|
		|	Tom		|
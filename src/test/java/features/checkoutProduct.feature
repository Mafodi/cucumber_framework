Feature: Checkout Selected Product

Scenario Outline: Checkout the selected number of product
	Given User is on GreenKart landing page
	When user adds number of selected productname <ProductName> to cart
	Then validate product name in checkout page
	
	Examples:
		| 	ProductName	|
		|	cauli		|
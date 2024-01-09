package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPageObjects;
import pageObjects.LandingPageObjects;
import utils.TestContextSetup;



public class CheckoutSteps {
	
	TestContextSetup testContextSetup;
	
	public CheckoutPageObjects checkoutPageObjects;
	
	public CheckoutSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	
	@When("^user adds number of selected productname (.+) to cart$")
	public void user_adds_number_of_selected_productname_to_cart(String productName) throws InterruptedException {
		
		LandingPageObjects landingPageObjects = testContextSetup.pageObjectManager.getLandingPageObjects();
		landingPageObjects.searchItem(productName);
		
		landingPageObjects.clickNoOfProdIncrement(4);
		
		Thread.sleep(3000);
		
//		checkoutPageObjects = testContextSetup.pageObjectManager.geCheckoutPageObjects();
//		String checkoutProductName = checkoutPageObjects.getProductName().split("-")[0].trim();
		
		
	}
	@Then("validate product name in checkout page")
	public void validate_product_name_in_checkout_page() {
	    System.out.println("validate_product_name_in_checkout_page");
	}
	
}

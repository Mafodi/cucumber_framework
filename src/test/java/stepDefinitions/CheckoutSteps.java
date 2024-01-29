package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPageObjects;
import pageObjects.LandingPageObjects;
import utils.TestContextSetup;



public class CheckoutSteps {
	
public WebDriver driver;
	
	public String landingPageProductName;
	public String offerPageProductName;
	public String checkoutPageProductName;
	
	TestContextSetup testContextSetup;
	public CheckoutPageObjects checkoutPageObjects;
	
	public CheckoutSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.checkoutPageObjects = testContextSetup.pageObjectManager.geCheckoutPageObjects();
	}
	
	@Then("^user proceeds to checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout_and_validate_the_tom_items_in_checkout_page(String name) throws InterruptedException {
	    checkoutPageObjects.checkoutItems();
	    Thread.sleep(2000);
	    
	    /*String checkoutPageProductName = checkoutPageObjects.getProductName().split("-")[0].trim();
	    Assert.assertEquals(checkoutPageProductName, name);*/
	}
	
	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
	    Assert.assertTrue(checkoutPageObjects.verifyPromoBtn());
	    Assert.assertTrue(checkoutPageObjects.verifyPlaceOrderBtn());
	}
	
}

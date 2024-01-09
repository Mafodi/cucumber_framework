package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LandingPageObjects;
import pageObjects.OfferPageObjects;
import utils.TestContextSetup;

public class OfferPageSteps {
	
	String offerPageProductName;
	TestContextSetup testContextSetup;
	
	public OfferPageSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	

	@And("^user search for the (.+) shortname in offers page$")
	public void user_search_for_the_shortname_in_offers_page(String searchName) throws InterruptedException {
		
			switchToOffersPage();
			
		 	OfferPageObjects offerPageObjects = testContextSetup.pageObjectManager.getOfferPageObjects();
		    offerPageObjects.searchItem(searchName);
		    Thread.sleep(2000);
		    offerPageProductName = offerPageObjects.getProductName();
	}
	
	@Then("validate product name in offers page matches with landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() throws InterruptedException {
		Thread.sleep(3000);
	   Assert.assertEquals(offerPageProductName, testContextSetup.landingPageProductName);
	}
	
	public void switchToOffersPage() {
		LandingPageObjects landingPageObjects = testContextSetup.pageObjectManager.getLandingPageObjects();
	 	landingPageObjects.clickToDealsPage();
	 	testContextSetup.genericUtils.switchWindowToChilds();
	}
		
		

}

package stepDefinitions;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
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
import utils.TestBase;
import utils.TestContextSetup;

public class LandingPageSteps {
	
	//public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	
	
	public TestBase testBase;
	LandingPageObjects landingPageObjects;
	TestContextSetup testContextSetup;
	
	public LandingPageSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPageObjects = testContextSetup.pageObjectManager.getLandingPageObjects();
	}
	
	@Given("User is on GreenKart landing page")
	public void user_is_on_green_kart_landing_page() throws IOException {
		Assert.assertTrue(landingPageObjects.getLandingTitlePage().contains("GreenKart"));
	}
	
	@When("^user searched with shortname (.+) and extract actual name of the product$")
	public void user_searched_with_shortname_and_extract_actual_name_of_the_product(String searchName) throws InterruptedException {
		//new LandingPageObjects(testContextSetup.driver);
		
		landingPageObjects.searchItem(searchName);
		
		Thread.sleep(4000);
		testContextSetup.landingPageProductName = landingPageObjects.getProductName().split("-")[0].trim();
		System.out.println(landingPageProductName + " is extracted from product home page");
		
	}
	
	@When("added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String quantity) {
	   landingPageObjects.clickIncrement(Integer.parseInt(quantity));
	   landingPageObjects.addToCart();
	}
	

}

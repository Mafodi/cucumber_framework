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
	TestContextSetup testContextSetup;
	
	public LandingPageSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	@Given("User is on GreenKart landing page")
	public void user_is_on_green_kart_landing_page() throws IOException {
		//testContextSetup.testBase.driverManagerManager();
		
//		testContextSetup.driver = WebDriverManager.chromedriver().create();
//		testContextSetup.driver.manage().window().maximize();
//		testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	@When("^user searched with shortname (.+) and extract actual name of the product$")
	public void user_searched_with_shortname_and_extract_actual_name_of_the_product(String searchName) throws InterruptedException {
		//new LandingPageObjects(testContextSetup.driver);
		LandingPageObjects landingPageObjects = testContextSetup.pageObjectManager.getLandingPageObjects();
		landingPageObjects.searchItem(searchName);
		
		Thread.sleep(4000);
		testContextSetup.landingPageProductName = landingPageObjects.getProductName().split("-")[0].trim();
		System.out.println(landingPageProductName + " is extracted from product home page");
		
	}
	

}

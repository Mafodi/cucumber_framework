package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	
	public LandingPageObjects landingPageObjects;
	public OfferPageObjects offerPageObjects;
	public CheckoutPageObjects checkoutPageObjects;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPageObjects getLandingPageObjects() {
		landingPageObjects = new LandingPageObjects(driver);
		return landingPageObjects;
	}
	
	public OfferPageObjects getOfferPageObjects() {
		offerPageObjects = new OfferPageObjects(driver);
		return offerPageObjects;
	}
	
	public CheckoutPageObjects geCheckoutPageObjects() {
		checkoutPageObjects = new CheckoutPageObjects(driver);
		return checkoutPageObjects;
	}

}

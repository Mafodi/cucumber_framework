package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPageObjects {
	
	public WebDriver driver;
	
	public CheckoutPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	By cartBag = By.cssSelector("[alt='Cart']");
	By checkoutButton = By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]");
	By promoButton = By.cssSelector(".promoBtn");
	By placeOrderButton = By.xpath("//button[contains(text(), 'Place Order')]");
	
	
	
	By productName = By.xpath("//p[@class='product-name']");
	By productQuantity = By.xpath("//p[@class='quantity']");
	By applyButton = By.xpath("//button[@class='promoBtn']");
	
	public void clickApplyButton() {
		driver.findElement(applyButton).click();
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public void checkoutItems() {
		driver.findElement(cartBag).click();
		driver.findElement(checkoutButton).click();
	}
	
	public Boolean verifyPromoBtn() {
		return driver.findElement(promoButton).isDisplayed();
	}
	
	public Boolean verifyPlaceOrderBtn() {
		return driver.findElement(placeOrderButton).isDisplayed();
	}
	
	
	

}

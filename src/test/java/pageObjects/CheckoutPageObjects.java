package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPageObjects {
	
	public WebDriver driver;
	
	public CheckoutPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	By productName = By.xpath("//p[@class='product-name']");
	By productQuantity = By.xpath("//p[@class='quantity']");
	By applyButton = By.xpath("//button[@class='promoBtn']");
	
	public void clickApplyButton() {
		driver.findElement(applyButton).click();
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	
	

}

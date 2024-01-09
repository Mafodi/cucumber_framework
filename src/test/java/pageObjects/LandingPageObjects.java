package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageObjects {
	
	public WebDriver driver;
	
	public LandingPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	
	private By search = By.xpath("//input[@type='search']");
	private By productName = By.xpath("//h4[@class='product-name']");
	private By topDeals = By.linkText("Top Deals");
	private By noOfProdIncrement = By.xpath("//a[@class = 'increment']");
	
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public void clickToDealsPage() {
		driver.findElement(topDeals).click();
	}
	
	public int clickNoOfProdIncrement(int numberOfProduct) {
		
		int value = 1;
		
		do {
			driver.findElement(noOfProdIncrement).click();
		} while(value >= numberOfProduct);
		
		
		return value;
	}

}

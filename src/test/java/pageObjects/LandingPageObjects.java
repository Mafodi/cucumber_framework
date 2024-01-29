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
	private By increment = By.xpath("//a[@class = 'increment']");
	private By addToCart = By.cssSelector(".product-action button");
	
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public void clickToDealsPage() {
		driver.findElement(topDeals).click();
	}
	
	public String getLandingTitlePage() {
		return driver.getTitle();
	}
	
	public void clickIncrement(int quantity) {
		
		int i = quantity-1;
		
		while(i > 0) {
			driver.findElement(increment).click();
			i--;
		}
		
	}
	
	public void addToCart() {
		driver.findElement(addToCart).click();
	}

}

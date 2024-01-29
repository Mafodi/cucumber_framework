package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver driverManagerManager() throws IOException {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		String browser_properties = prop.getProperty("browser");
		String browser_maven = System.getProperty("browser");
		
		String browser = browser_maven!=null ?  browser_maven :  browser_properties;
		

		if (driver == null) {
			if (browser.equalsIgnoreCase("chrome")) {
				driver = WebDriverManager.chromedriver().create();
			} else if (browser.equalsIgnoreCase("firefox")) {
				driver = WebDriverManager.firefoxdriver().create();
				
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
		}

		return driver;

	}
	

}

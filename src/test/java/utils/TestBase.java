package utils;

import java.io.FileInputStream;
import java.io.IOException;
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

		if (driver == null) {
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				driver = WebDriverManager.chromedriver().create();
			} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				driver = WebDriverManager.firefoxdriver().create();
				
			}
			driver.manage().window().maximize();
			driver.get(url);
		}

		return driver;

	}
	

}

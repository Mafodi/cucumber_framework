package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class Hooks {
	
	TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	@After
	public void AfterScenario() throws IOException {
		testContextSetup.testBase.driverManagerManager().quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws WebDriverException, IOException {
		if(scenario.isFailed()) {
			File sourcePath = ((TakesScreenshot)testContextSetup.testBase.driverManagerManager()).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
		}
	}

}

package utils;


import java.io.IOException;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	 
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.driverManagerManager());
		genericUtils = new GenericUtils(testBase.driverManagerManager());
		
	}
	

}

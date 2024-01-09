package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/checkoutProduct.feature",
				glue = "stepDefinitions",
				monochrome = true,
				dryRun = false
			)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
	
//	@Override
//	@DataProvider(parallel=true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}

}

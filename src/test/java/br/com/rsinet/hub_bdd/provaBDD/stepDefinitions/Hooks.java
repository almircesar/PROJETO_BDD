//package br.com.rsinet.hub_bdd.provaBDD.stepDefinitions;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//import com.google.common.io.Files;
//
//import br.com.resinet.hub_bdd.provaBDD.cucumber.TestContext;
//import br.com.resinet.hub_bdd.provaBDD.selenium.Wait;
//import br.com.rsinet.hub_bdd.provaBDD.Managers.WebDriverManager;
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import gherkin.formatter.Reporter;
//import junit.textui.TestRunner;
//
//public class Hooks {
//	WebDriver driver;
//	TestContext testContext;
//	WebDriverManager manager;
//
//	public Hooks(TestContext context) {
//		testContext = context;
//		manager = testContext.getWebDriverManager();
//		driver = manager.getDriver();
//	}
//
//	@Before
//	public void BeforeSteps() {
//		manager.getDriver();
//	}
//
//	@After(order = 1)
//	public void afterScenario(Scenario scenario) throws IOException, InterruptedException {
//		Wait.waitForPageLoad(driver);
//		Wait.untilJqueryIsDone(driver);
//		Wait.untilPageLoadComplete(driver);
//
//		String screenshotName = scenario.getName().replaceAll(" ", "_");
//		File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver())
//				.getScreenshotAs(OutputType.FILE);
//		File destinationPath = new File(TestRunner.folderPath + "/" + screenshotName + ".png");
//
//		Files.copy(sourcePath, destinationPath);
//
//		Reporter.addScreenCaptureFromPath(destinationPath.toString());
//	}
//
//	@After(order = 0)
//	public void AfterSteps() {
//		testContext.getWebDriverManager().closeDriver();
//	}
//
//}
//
//

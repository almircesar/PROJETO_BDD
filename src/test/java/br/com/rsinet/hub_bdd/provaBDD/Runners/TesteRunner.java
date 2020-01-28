package br.com.rsinet.hub_bdd.provaBDD.Runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import br.com.rsinet.hub_bdd.provaBDD.Managers.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = { "br.com.rsinet.hub_bdd.provaBDD.stepDefinitions" }, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true)
public class TesteRunner {

	@AfterClass
	public static void writeExtentReport() {
		com.cucumber.listener.Reporter
				.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}
}

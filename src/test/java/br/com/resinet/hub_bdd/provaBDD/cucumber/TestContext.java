package br.com.resinet.hub_bdd.provaBDD.cucumber;

import br.com.rsinet.hub_bdd.provaBDD.Managers.PageObject_Managers;
import br.com.rsinet.hub_bdd.provaBDD.Managers.WebDriverManager;

public class TestContext {

	private WebDriverManager webDriverManager;
	private PageObject_Managers pageObjectManager;

	public TestContext() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObject_Managers(webDriverManager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageObject_Managers getPageObjectManager() {
		return pageObjectManager;
	}

}

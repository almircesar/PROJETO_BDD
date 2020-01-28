package br.com.rsinet.hub_bdd.provaBDD.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.resinet.hub_bdd.provaBDD.DataProviders.ConfigFileReader;
import br.com.rsinet.hub_bdd.provaBDD.Managers.FileReaderManager;

public class Home_Page {

	WebDriver driver;
	ConfigFileReader configFileReader;

	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
	}

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement Btn_user;

	@FindBy(how = How.XPATH, using = "//*[@id=\\\"menuSearch\\\"]")
	private WebElement btn_Search;

	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement Pesquisa_Search;

	@FindBy(how = How.XPATH, using = "//*[@id=\\\"search\\\"]/div/div/img")
	private WebElement fechasearch;

	@FindBy(how = How.LINK_TEXT, using = "CREATE NEW ACCOUNT")
	private WebElement Btn_registro;

	@FindBy(how = How.ID, using = "headphonesImg")
	private WebElement HeadPhones;

	@FindBy(how = How.XPATH, using = "//*[@id=\"details_10\"]")
	private WebElement ProdutoQueVaiParaOErrado;

	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement ClicaNaLupa;

	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement DigitaNaLupa;

	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement salvarNoCarrinhoLinkText;

	public void WaitCarrinhoLinkText() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(salvarNoCarrinhoLinkText));
	}

	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	public void clica_Register() {
		Btn_registro.sendKeys(Keys.ENTER);

	}

	public void clica_user() {
		Btn_user.click();

	}

	public void clica_HeadPhone() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", HeadPhones);
	}

	public void clica_no_produto_errado() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ProdutoQueVaiParaOErrado);
	}

	public void clica_lupa() {
		ClicaNaLupa.click();
	}

	public void EnterPesquisa() {
		DigitaNaLupa.sendKeys(Keys.ENTER);

	}

	public void digitaProdutoEspecifico() {
		DigitaNaLupa.sendKeys("Beats Studio 2 Over-Ear Matte Black Headphones");

	}

	public void digitaProdutoErrado() {
		DigitaNaLupa.sendKeys("Cadeira Gamer");

	}

	public void waitElementHeadphone() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(HeadPhones));
	}
}
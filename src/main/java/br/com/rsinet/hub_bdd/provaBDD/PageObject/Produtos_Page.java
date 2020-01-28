package br.com.rsinet.hub_bdd.provaBDD.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.resinet.hub_bdd.provaBDD.DataProviders.ConfigFileReader;

public class Produtos_Page {
	WebDriver driver;
	ConfigFileReader configFileReader;

	public Produtos_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
	}

	@FindBy(how = How.LINK_TEXT, using = "HP ELITEBOOK FOLIO")
	private WebElement notebook;

	@FindBy(how = How.CLASS_NAME, using = "ng-scope")
	private WebElement produto;

	@FindBy(how = How.LINK_TEXT, using = "LOGITECH G502 PROTEUS CORE")
	private WebElement escolhermouse;

	@FindBy(how = How.LINK_TEXT, using = "Logitech USB Headset H390")
	private WebElement escolherProduto;

	@FindBy(how = How.XPATH, using = "//*[@id=\"searchPage\"]/div[3]/div/div/div[2]/ul/li/p[1]/a")
	private WebElement NoteDaPesquisa;

	@FindBy(how = How.XPATH, using = "//*[@id=\"searchPage\"]/div[3]/div/label/span")
	private WebElement ProdutoInexistente;

	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement salvarNoCarrinhoLinkText;

	public void clicarProduto() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", escolherProduto);

	}

	public void ClicaNoNotePosPesquisa() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", NoteDaPesquisa);

	}

	public void ProdutoInexistentePosPesquisa() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ProdutoInexistente);

	}

	public void WaitCarrinhoLinkText() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(salvarNoCarrinhoLinkText));
	}
}
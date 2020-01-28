package br.com.rsinet.hub_bdd.provaBDD.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(how = How.LINK_TEXT,using= "HP Pavilion 15t Touch Laptop")
	private WebElement NoteDaPesquisa;

	@FindBy(how = How.XPATH, using= "//*[@id=\"searchPage\"]/div[3]/div/label/span")
	private WebElement ProdutoInexistente;
	
	public void clicarProduto() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", escolherProduto);

	}
	public void ClicaNoNotePosPesquisa() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", NoteDaPesquisa);
	
}
	public void  ProdutoInexistentePosPesquisa() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ProdutoInexistente);
	
}
}
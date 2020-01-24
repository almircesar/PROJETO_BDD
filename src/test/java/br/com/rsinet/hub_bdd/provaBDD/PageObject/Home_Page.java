package br.com.rsinet.hub_bdd.provaBDD.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	WebDriver driver;

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "menuUser")
	private WebElement Btn_user;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\\\"menuSearch\\\"]")
	private WebElement btn_Search;
	
	@FindBy (how = How.ID,using = "autoComplete")
	private WebElement Pesquisa_Search;
	//
	@FindBy(how = How.LINK_TEXT, using = "LOGITECH G502 PROTEUS CORE")
	private WebElement escolhermouse;
	
//	@FindBy(how = How.LINK_TEXT,using = "Logitech G502 Proteus Core")
//	private WebElement escolhermouser;
	
	@FindBy (how = How.CLASS_NAME,using = "ng-scope")
	private WebElement produto;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\\\"search\\\"]/div/div/img")
	private WebElement fechasearch;
	
	@FindBy(how = How.ID,using = "headphonesImg")
	private WebElement HeadPhones;
	
	@FindBy (how = How.LINK_TEXT,using = "HP ELITEBOOK FOLIO")
	private WebElement notebookFolio;
	
	@FindBy (how = How.ID,using = "//*[@id=\\\"details_10\\\"]\"")
	private WebElement notebookElement;
	
	@FindBy (how = How.LINK_TEXT, using = "CREATE NEW ACCOUNT")
	private WebElement Btn_registro;
	
	public void click_User() {
		Btn_user.click();
	}
		public void clica_Register() {
			Btn_registro.sendKeys(Keys.ENTER);
			
		}
		
		
	}



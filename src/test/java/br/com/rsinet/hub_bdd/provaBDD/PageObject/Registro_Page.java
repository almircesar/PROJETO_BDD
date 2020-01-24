package br.com.rsinet.hub_bdd.provaBDD.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registro_Page {

	WebDriver driver;

	public Registro_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement txtbx_NomeUser;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement txtbx_Email;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement txtbx_Senha;

	@FindBy(how = How.XPATH, using = "//*[@id=\\\"formCover\\\"]/div[1]/div[2]/sec-view[2]/div/input")
	private WebElement txtbx_ConfimaSenha;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement txtbx_PrimeiroNome;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement txtbx_ultimoNome;

	@FindBy(how = How.XPATH, using = "\"//*[@id=\\\"formCover\\\"]/div[2]/div[2]/sec-view/div/input\"")
	private WebElement txtbx_NumeroDeTelefone;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement SelecionePais;

	@FindBy(how = How.XPATH, using = "//*[@id=\\\"formCover\\\"]/sec-view/div/input")
	private WebElement btn_AceitaCondições;

	@FindBy(how = How.XPATH, using = "//*[@id=\\\"formCover\\\"]/div[3]/div[1]/sec-view[2]/div/input")
	private WebElement txtbx_Cidade;

	@FindBy(how = How.XPATH, using = "//*[@id=\\\"formCover\\\"]/div[3]/div[2]/sec-view[1]/div/input")
	private WebElement txtbx_Endereço;

	@FindBy(how = How.XPATH, using = "//*[@id=\\\"formCover\\\"]/div[3]/div[2]/sec-view[2]/div/input")
	private WebElement txtbx_Estado;

	@FindBy(how = How.XPATH, using = "//*[@id=\\\"formCover\\\"]/div[3]/div[3]/sec-view/div/input")
	private WebElement txtbx_CodPostal;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btn_Registrar;

	@FindBy(how = How.LINK_TEXT, using = "Use maximum 15 character")
	private WebElement error_CaracteresAMais;

	public void enter_NomeUser(String NomeUser) {
		txtbx_NomeUser.sendKeys(NomeUser);
	}

	public void enter_Email(String email) {
		txtbx_Email.sendKeys(email);
	}

	public void enter_Senha(String senha) {
		txtbx_Senha.sendKeys(senha);
	}

	public void enter_ConfSenha(String confSenha) {
		txtbx_ConfimaSenha.sendKeys(confSenha);
	}

	public void enter_Nome(String PrimeiroNome) {
		txtbx_PrimeiroNome.sendKeys(PrimeiroNome);
	}

	public void enter_UltimoNome(String UltimoNome) {
		txtbx_ultimoNome.sendKeys(UltimoNome);
	}

	public void enter_Telefone(String Telefone) {
		txtbx_NumeroDeTelefone.sendKeys(Telefone);
	}

	public void select_Country(String Pais) {
		Select selectCountry = new Select(SelecionePais);
		selectCountry.selectByVisibleText(Pais);
	}

	public void enter_City(String city) {
		txtbx_Cidade.sendKeys(city);
	}

	public void enter_Adress(String adress) {
		txtbx_Endereço.sendKeys(adress);
	}

	public void enter_Region(String region) {
		txtbx_Estado.sendKeys(region);
	}

	public void enter_PostalCode(String postalCode) {
		txtbx_CodPostal.sendKeys(postalCode);
	}

	public void click_Agree() {
		btn_AceitaCondições.click();
	}

	public void click_Register() {
		btn_Registrar.click();
	}

	public void Preencher_DadosPessoais() {
		enter_NomeUser("Almirr");
		enter_Email("Almir_czzzz@hotmail.com");
		enter_Senha("5frteAA54");
		enter_ConfSenha("5frteAA54");
		enter_Nome("Almir");
		enter_UltimoNome("César");
		enter_Telefone("11984193778");
		select_Country("Brazil");
		enter_City("Osasco");
		enter_Adress("Rua Jamber");
		enter_Region("São Paulo");
		enter_PostalCode("06256-132");

	}

	public void fill_PersonalDetailsIncorrectly() {
		enter_NomeUser("Almaaaaaaaaaaaaaaaaaaaaaaaaaaar4");
		enter_Email("Almir_czzzz@hotmail.com");
		enter_Senha("5frteAA54");
		enter_ConfSenha("5frteAA54");
		enter_Nome("Almir");
		enter_UltimoNome("César");
		enter_Telefone("11984193778");
		select_Country("Brazil");
		enter_City("Osasco");
		enter_Adress("Rua Jamber");
		enter_Region("São Paulo");
		enter_PostalCode("06256-132");

	}
}

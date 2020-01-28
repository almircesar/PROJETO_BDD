package br.com.rsinet.hub_bdd.provaBDD.stepDefinitions;

import org.openqa.selenium.WebDriver;

import br.com.resinet.hub_bdd.provaBDD.cucumber.TestContext;
import br.com.rsinet.hub_bdd.provaBDD.Managers.WebDriverManager;
import br.com.rsinet.hub_bdd.provaBDD.PageObject.Home_Page;
import br.com.rsinet.hub_bdd.provaBDD.PageObject.Produtos_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ProdutosPage_Step {

	WebDriver driver;
	TestContext testContext;
	Produtos_Page produtosPage;
	WebDriverManager manager;
	Home_Page homepage;

	public ProdutosPage_Step(TestContext context) {
		testContext = context;
		produtosPage = testContext.getPageObjectManager().getProductPage();
		
	}

	@And("^clica em um produto$")
	public void clica_em_um_produto() {
		
		produtosPage.clicarProduto();
		produtosPage.WaitCarrinhoLinkText();
	}

	@Then("^pesquisa concluida$")
	public void pesquisa_concluida() {
		
		produtosPage.ClicaNoNotePosPesquisa();
		produtosPage.WaitCarrinhoLinkText();
	}
	@Then("^pesquisa invalida")
	public void pesquisa_invalida() {
		
		produtosPage.ProdutoInexistentePosPesquisa();
	
}
}

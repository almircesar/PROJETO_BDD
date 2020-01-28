package br.com.rsinet.hub_bdd.provaBDD.stepDefinitions;

import org.openqa.selenium.WebDriver;

import br.com.resinet.hub_bdd.provaBDD.cucumber.TestContext;
import br.com.rsinet.hub_bdd.provaBDD.PageObject.Home_Page;
import br.com.rsinet.hub_bdd.provaBDD.PageObject.Produtos_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage_Step {
	
	WebDriver driver;
	TestContext testContext;
	Home_Page   homePage;
	Produtos_Page produtospage;
	
	public HomePage_Step(TestContext context) {
		this.driver = driver;
		testContext = context;
		homePage = testContext.getPageObjectManager().getHome_Page();
	}

	
	@Given("^Usuario esta na home$")
	public void usuario_esta_na_home() {
	  homePage.navigateTo_HomePage();
	}
	
	@When("^usuario na pagina de registro$")
	public void usuario_na_pagina_de_registro() throws Throwable {
		homePage.clica_user();
		homePage.clica_Register();
	}


	@When("^clica em uma categoria da home$")
	public void clica_em_uma_categoria_da_home(){
	   homePage.clica_HeadPhone();
	}

	@When("^clica em um produto invalido da home$")
	public void clica_em_um_produto_invalido_da_home() throws Throwable {
		homePage.clica_no_produto_errado();
	}
	@When("^Procurando produto especifico$")
	public void procurando_produto_especifico()  {
		homePage.clica_lupa();
		homePage.digita_na_Lupa();
		homePage.digitaProdutoEspecifico();
		
	    
	}


}

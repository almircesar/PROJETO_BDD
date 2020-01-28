package br.com.rsinet.hub_bdd.provaBDD.stepDefinitions;

import org.openqa.selenium.WebDriver;

import br.com.resinet.hub_bdd.provaBDD.cucumber.TestContext;
import br.com.rsinet.hub_bdd.provaBDD.PageObject.Home_Page;
import br.com.rsinet.hub_bdd.provaBDD.PageObject.Registro_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistroStep {
	WebDriver driver;
	TestContext testContext;
	Registro_Page registerPage;
	Home_Page   homePage;
	
	public RegistroStep(TestContext context) {
		this.driver = driver;
		testContext = context;
		registerPage = testContext.getPageObjectManager().getRegisterPage();
	}
	
	@When("^Preenche campos$")
	public void preenche_campos() {
		registerPage.Preencher_DadosPessoais();
	}


	@Then("^Cadastro feito com sucesso$")
	public void cadastro_feito_com_sucesso() {
	  registerPage.click_Agree();
	  registerPage.click_Register();
	}
	
	@When("^Registra com caracteres a mais$")
	public void registra_com_caracteres_a_mais() {
		registerPage.fill_PersonalDetailsIncorrectly();
	}


	@Then("^Ficar na mesma pagina e nao registra$")
	public void ficar_na_mesma_pagina_e_nao_registra() {
	  registerPage.click_Agree();
	  registerPage.click_Register();
	}

	

}
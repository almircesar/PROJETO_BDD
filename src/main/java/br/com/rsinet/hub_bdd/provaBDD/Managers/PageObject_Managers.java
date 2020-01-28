package br.com.rsinet.hub_bdd.provaBDD.Managers;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.provaBDD.PageObject.Home_Page;
import br.com.rsinet.hub_bdd.provaBDD.PageObject.Produtos_Page;
import br.com.rsinet.hub_bdd.provaBDD.PageObject.Registro_Page;

public class PageObject_Managers {

	private WebDriver driver;

	private Home_Page homePage;

	private Registro_Page registerPage;

	private Produtos_Page productPage;

	public PageObject_Managers(WebDriver driver) {

		this.driver = driver;

	}

	public Home_Page getHome_Page() {

		return (homePage == null) ? homePage = new Home_Page(driver) : homePage;

	}

	public Registro_Page getRegisterPage() {

		return (registerPage == null) ? registerPage = new Registro_Page(driver) : registerPage;

	}

	public Produtos_Page getProductPage() {

		return (productPage == null) ? productPage = new Produtos_Page(driver) : productPage;

	}

}
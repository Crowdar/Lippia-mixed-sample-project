package ar.web.steps;

import org.testng.Assert;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.PageSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import web.pages.LoginPage;
import web.pages.UserMainPage;

public class LoginSteps extends PageSteps {

	private LoginPage loginPage;
	private UserMainPage userMainPage;
	
	public LoginSteps(SharedDriver driver){
        super(driver);
        loginPage = new LoginPage(driver);
        userMainPage = new UserMainPage(driver);
    }
	
	@Given("^el usuario esta en el portal de nubi backoffice$")
	public void asAnApiUserForExampleEndpoint() {
		loginPage.go();
		loginPage.isPageDisplayed();
	}

	@When("^se ingresa usuario: '(.*)' y clave: '(.*)'$")
	public void login(String username, String password){
		loginPage.login(username, password);
	}
	
	@Then("^el usuario visualiza correctamente la pantalla de Inicio de NUBI$")
	public void mainPageIsDisplayed() {
		loginPage.waitForLoadingDisapear();
    	Assert.assertTrue(userMainPage.isLogguedIn());
	}

	@Then("^el usuario visualiza un mensaje de '(.*)'$")
	public void errorMessageVerification(String message) {
		loginPage.waitForLoadingDisapear();
		Assert.assertTrue(false);
	}

}

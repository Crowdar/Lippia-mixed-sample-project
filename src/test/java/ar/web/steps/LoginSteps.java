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
	
	@Given("^I want to go to test web page main page$")
	public void asAnApiUserForExampleEndpoint() {
		loginPage.go();
		loginPage.isPageDisplayed();
	}

	@When("^I perform login with username: '(.*)' and password: '(.*)'$")
	public void completeUsername(String username, String password){
		loginPage.login(username, password);
	}
	
	@Then("^I verify the main logued user page is displayed$")
	public void mainPageIsDisplayed() {
		loginPage.waitForLoadingDisapear();
    	Assert.assertTrue(userMainPage.isLogguedIn());
	}

}

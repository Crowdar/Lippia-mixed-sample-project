package ar.web.steps;

import java.lang.reflect.InvocationTargetException;

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

	@When("^I complete the username field as '(.*)'$")
	public void completeUsername(String username) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		loginPage.completeFieldUsername(username);
	
	}
	
	@When("^I complete the password field with '(.*)'$")
	public void completePassword(String password) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		loginPage.completeFieldPassword(password);
	
	}
	
	@When("^I perform a click on sigin button$")
	public void clickOnSiginButto() throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		loginPage.clickSendButton();
	}

	@Then("^I verify the main logued user page is displayed$")
	public void mainPageIsDisplayed() {
		loginPage.waitForLoadingDisapear();
    	Assert.assertTrue(userMainPage.isLogguedIn());
	}

}

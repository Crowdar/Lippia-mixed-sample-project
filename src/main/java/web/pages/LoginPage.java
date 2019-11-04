package web.pages;

import org.openqa.selenium.By;

import com.crowdar.bdd.cukes.SharedDriver;

public class LoginPage extends CustomPageBase {

	private static final String USERNAME_INPUT_LOCATOR_CSS = "input[name='user_email']";
	private static final String PASSWORD_INPUT_LOCATOR_CSS = "input[name='password']";
	private static final String SEND_BUTTON_LOCATOR_CSS = "#root > div > div.form___-EEwu > div.buttonsWrapper___1un17 > button.button___33XKF";
	private static final String LOADING_DIV = "#root > div > div.loaderWrapper___SliuJ";
	
	public LoginPage(SharedDriver driver) {
		super(driver);
	}
	
	public void clickSendButton() {
		clickElement(By.cssSelector(SEND_BUTTON_LOCATOR_CSS));
	}
	
	public void completeFieldUsername(String username) {
		completeField(By.cssSelector(USERNAME_INPUT_LOCATOR_CSS), username);
	}

	public void completeFieldPassword(String password) {
		completeField(By.cssSelector(PASSWORD_INPUT_LOCATOR_CSS), password);
	}
	
	public boolean isPageDisplayed() {
		return isElementPresent(By.cssSelector(SEND_BUTTON_LOCATOR_CSS));
	}

	public void go() {
		url = "";
        navigateToIt();
	}

	public void waitForLoadingDisapear() {
		waitForElementDisappears(By.cssSelector(LOADING_DIV));
	}
	
}

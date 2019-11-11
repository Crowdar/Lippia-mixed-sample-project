package web.pages.usermainpage.modals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.crowdar.bdd.cukes.SharedDriver;

import web.pages.CustomPageBase;

public class UnlinkRelatedBankAccountsSuccessModal extends CustomPageBase {
	
	private static final String UNLINK_RELATED_BANK_ACCOUNT_SUCCESS_MODAL_LOCATOR_CSS = "#root > div > div.rightWrapper___3BEGM > div.contentWrapper___NnthQ > div.modal___1R5wd.checkSuccess___1b_Tq.undefined.active___12eWl";
	private static final String UNLINK_RELATED_BANK_ACCOUNT_SUCCESS_MODAL_OK_MESSAGE_LOCATOR_CSS = " > div.container___s8Zvx > div.title___2si7Z > h1";
	private static final String UNLINK_RELATED_BANK_ACCOUNT_SUCCESS_MODAL_SAME_TITULAR_CHECKBOX_LOCATOR_CSS = " > div.container___s8Zvx > div:nth-child(4) > div > div > div.checkIcon___3vhOM";
	private static final String UNLINK_RELATED_BANK_ACCOUNT_SUCCESS_MODAL_CONFIRM_BUTTON_LOCATOR_CSS = " > div.buttons___1WOfZ > div > button.button___33XKF";
	private static final String UNLINK_RELATED_BANK_ACCOUNT_SUCCESS_MODAL_CANCEL_BUTTON_LOCATOR_CSS = " > div.buttons___1WOfZ > div > button.prevButton___2bwfU";
	
	public UnlinkRelatedBankAccountsSuccessModal(SharedDriver driver) {
		super(driver);
	}
	
	public boolean isModalPresent() {
		return isElementPresentAndDisplayed(By.cssSelector(UNLINK_RELATED_BANK_ACCOUNT_SUCCESS_MODAL_LOCATOR_CSS));
	}
	
	private WebElement getModal() {
		return getWebElement(By.cssSelector(UNLINK_RELATED_BANK_ACCOUNT_SUCCESS_MODAL_LOCATOR_CSS));
	}
	
	public boolean isOkMessageDisplayed() {
		return isElementPresent(getModal(), By.cssSelector(UNLINK_RELATED_BANK_ACCOUNT_SUCCESS_MODAL_OK_MESSAGE_LOCATOR_CSS));
	}
	
	public void clickSameTitularCheckbox() {
		clickElement(getModal().findElement(By.cssSelector(UNLINK_RELATED_BANK_ACCOUNT_SUCCESS_MODAL_SAME_TITULAR_CHECKBOX_LOCATOR_CSS)));
	}
	
	public void clickConfirmButton() {
		clickElement(getModal().findElement(By.cssSelector(UNLINK_RELATED_BANK_ACCOUNT_SUCCESS_MODAL_CONFIRM_BUTTON_LOCATOR_CSS)));
	}
	
	public void clickCancelButton() {
		clickElement(getModal().findElement(By.cssSelector(UNLINK_RELATED_BANK_ACCOUNT_SUCCESS_MODAL_CANCEL_BUTTON_LOCATOR_CSS)));
	}
	
	public void waitForModalPresent() {
		waitAndCheckElementPresent(By.cssSelector(UNLINK_RELATED_BANK_ACCOUNT_SUCCESS_MODAL_LOCATOR_CSS));
	}
	
}

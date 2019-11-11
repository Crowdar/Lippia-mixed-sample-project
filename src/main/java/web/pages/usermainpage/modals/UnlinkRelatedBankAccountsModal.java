package web.pages.usermainpage.modals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.crowdar.bdd.cukes.SharedDriver;

import web.pages.CustomPageBase;

public class UnlinkRelatedBankAccountsModal extends CustomPageBase {
	
	private static final String UNLINK_RELATED_BANK_ACCOUNT_MODAL_LOCATOR_CSS = "#root > div > div.rightWrapper___3BEGM > div.contentWrapper___NnthQ > div.modal___1R5wd.unlinkModal___QBWfh.undefined.active___12eWl";
	private static final String UNLINK_RELATED_BANK_ACCOUNT_MODAL_ERROR_MESSAGE_LOCATOR_CSS = " > div.modal___1R5wd.unlinkModal___QBWfh.undefined.active___12eWl > div.form___4gAwQ > div.errorDescription___3dbm_";
	private static final String UNLINK_RELATED_BANK_ACCOUNT_MODAL_UNLINK_BUTTON_LOCATOR_CSS = " > div.buttons___1WOfZ > div > button.button___33XKF";
	private static final String UNLINK_RELATED_BANK_ACCOUNT_MODAL_CANCEL_BUTTON_LOCATOR_CSS = " > div.buttons___1WOfZ > div > button.prevButton___2bwfU";
	
	public UnlinkRelatedBankAccountsModal(SharedDriver driver) {
		super(driver);
	}
	
	public void waitForModalPresent() {
		waitAndCheckElementPresent(By.cssSelector(UNLINK_RELATED_BANK_ACCOUNT_MODAL_LOCATOR_CSS));
	}
	
	public boolean isModalPresent() {
		return isElementPresentAndDisplayed(By.cssSelector(UNLINK_RELATED_BANK_ACCOUNT_MODAL_LOCATOR_CSS));
	}
	
	private WebElement getModal() {
		return getWebElement(By.cssSelector(UNLINK_RELATED_BANK_ACCOUNT_MODAL_LOCATOR_CSS));
	}
	
	public boolean isErrorMessageDisplayed() {
		return isElementPresent(getModal(), By.cssSelector(UNLINK_RELATED_BANK_ACCOUNT_MODAL_ERROR_MESSAGE_LOCATOR_CSS));
	}
	
	public void clickUnlinkButton() {
		clickElement(getModal().findElement(By.cssSelector(UNLINK_RELATED_BANK_ACCOUNT_MODAL_UNLINK_BUTTON_LOCATOR_CSS)));
	}
	
	public void clickCancelButton() {
		clickElement(getModal().findElement(By.cssSelector(UNLINK_RELATED_BANK_ACCOUNT_MODAL_CANCEL_BUTTON_LOCATOR_CSS)));
	}
	
}

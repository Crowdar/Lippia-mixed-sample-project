package web.pages.usermainpage.sections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.crowdar.bdd.cukes.SharedDriver;

import web.pages.CustomPageBase;

public class RelatedBankAccountsSection extends CustomPageBase {
	
	private static final String RELATED_BANK_ACCOUNT_LIST_ITEM_LOCATOR_CSS = "#accountsList li";
	private static final String RELATED_BANK_ACCOUNT_BANK_NAME_LABEL_LOCATOR_CSS = "span";
	private static final String RELATED_BANK_ACCOUNT_NUMBER_LABEL_LOCATOR_CSS = "strong";
	private static final String RELATED_BANK_ACCOUNT_TYPE_LABEL_LOCATOR_CSS = "div > span";
	private static final String RELATED_BANK_ACCOUNT_UNLNIK_BUTTON_LOCATOR_CSS = "div > button";
	private static final String RELATED_BANK_ACCOUNT_LNIK_BUTTON_LOCATOR_CSS = "#root > div > div.rightWrapper___3BEGM > div.contentWrapper___NnthQ > div.container___bOti4 > div.linkedAccountsWrapper___MIlCI > div.contentContainer___DQpiQ > section > button";

	public RelatedBankAccountsSection(SharedDriver driver) {
		super(driver);
	}
	
	private String getRelatedAccountBankName(WebElement listItem) {
		return listItem.findElement(By.cssSelector(RELATED_BANK_ACCOUNT_BANK_NAME_LABEL_LOCATOR_CSS)).getText();
	}
	
	public String getRelatedAccountBankName(int row) {
		String itemSelector = ":nth-child("+row+")";
		WebElement relatedBankAccountItem = getWebElement(By.cssSelector(RELATED_BANK_ACCOUNT_LIST_ITEM_LOCATOR_CSS + itemSelector));
		return 	getRelatedAccountBankName(relatedBankAccountItem );
	}
	
	private String getRelatedAccountNumber(WebElement listItem) {
		return listItem.findElement(By.cssSelector(RELATED_BANK_ACCOUNT_NUMBER_LABEL_LOCATOR_CSS)).getText();
	}
	
	public String getRelatedAccountNumber(int row) {
		String itemSelector = ":nth-child("+row+")";
		WebElement relatedBankAccountItem = getWebElement(By.cssSelector(RELATED_BANK_ACCOUNT_LIST_ITEM_LOCATOR_CSS + itemSelector));
		return 	getRelatedAccountNumber(relatedBankAccountItem );
	}
	
	private String getRelatedAccountTypeName(WebElement listItem) {
		return listItem.findElement(By.cssSelector(RELATED_BANK_ACCOUNT_TYPE_LABEL_LOCATOR_CSS)).getText();
	}
	
	public String getRelatedAccountTypeName(int row) {
		String itemSelector = ":nth-child("+row+")";
		WebElement relatedBankAccountItem = getWebElement(By.cssSelector(RELATED_BANK_ACCOUNT_LIST_ITEM_LOCATOR_CSS + itemSelector));
		return 	getRelatedAccountTypeName(relatedBankAccountItem );
	}
	
	private void clickUnlinkRelatedAccount(WebElement listItem) {
		clickElement(listItem.findElement(By.cssSelector(RELATED_BANK_ACCOUNT_UNLNIK_BUTTON_LOCATOR_CSS)));
	}
	
	public void clickLinkNewRelatedBankAccount() {
		clickElement(By.cssSelector(RELATED_BANK_ACCOUNT_LNIK_BUTTON_LOCATOR_CSS));

	}
	
	public void unlikRelatedBankAccount(int row) {
		String itemSelector = ":nth-child("+row+")";
		WebElement relatedBankAccountItem = getWebElement(By.cssSelector(RELATED_BANK_ACCOUNT_LIST_ITEM_LOCATOR_CSS + itemSelector));
		clickUnlinkRelatedAccount(relatedBankAccountItem);
	}
	
	public void unlikRelatedBankAccount(String accountNumber, String accounType, String bankName) {
		List<WebElement> relatedBankAccountList = getWebElements(By.cssSelector(RELATED_BANK_ACCOUNT_LIST_ITEM_LOCATOR_CSS));
		
		for(WebElement relatedBankAccountItem : relatedBankAccountList) {
			String pageAccountNumber = getRelatedAccountNumber(relatedBankAccountItem);
			String pageAccounType = getRelatedAccountTypeName(relatedBankAccountItem);
			String pageBankName = getRelatedAccountBankName(relatedBankAccountItem);
			if(pageAccountNumber.equals(accountNumber) && pageAccounType.equals(accounType) && pageBankName.equals(bankName)) {
				clickUnlinkRelatedAccount(relatedBankAccountItem);
				return;
			}
		}
		
		throw new IllegalArgumentException("The Related Bank Account is not pressent on list.");
	}
}

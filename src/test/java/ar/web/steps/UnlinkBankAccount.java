package ar.web.steps;

import org.testng.Assert;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.MyThreadLocal;
import com.crowdar.core.PageSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import web.pages.UserMainPage;
import web.pages.usermainpage.modals.UnlinkRelatedBankAccountsModal;
import web.pages.usermainpage.modals.UnlinkRelatedBankAccountsSuccessModal;
import web.pages.usermainpage.sections.RelatedBankAccountsSection;

public class UnlinkBankAccount extends PageSteps {

	private UserMainPage userMainPage;
	private RelatedBankAccountsSection relatedBankAccountsSection;
	private UnlinkRelatedBankAccountsModal unlinkRelatedBankAccountsModal;
	private UnlinkRelatedBankAccountsSuccessModal unlinkRelatedBankAccountsSuccessModal;
	
	public UnlinkBankAccount(SharedDriver driver){
        super(driver);
        userMainPage = new UserMainPage(driver);
        relatedBankAccountsSection = new RelatedBankAccountsSection(driver);
        unlinkRelatedBankAccountsModal = new UnlinkRelatedBankAccountsModal(driver);
        unlinkRelatedBankAccountsSuccessModal = new UnlinkRelatedBankAccountsSuccessModal(driver);
    }
	
	@Given("^I must be on the user main page$")
	public void asAnApiUserForExampleEndpoint() {
    	Assert.assertTrue(userMainPage.isLogguedIn());
	}

	@When("^I want to unlink the first bank account$")
	public void completeUsername()  {
		MyThreadLocal.get().setData("account", relatedBankAccountsSection.getRelatedAccountNumber(2));
		MyThreadLocal.get().setData("name", relatedBankAccountsSection.getRelatedAccountTypeName(2));
		MyThreadLocal.get().setData("bank", relatedBankAccountsSection.getRelatedAccountBankName(2));
		relatedBankAccountsSection.unlikRelatedBankAccount(2);
	}
	
	@When("^I accept the unlink related bank account modal$")
	public void acceptUnlinkRelatedBankAccountModal()  {
    	unlinkRelatedBankAccountsModal.waitForModalPresent();
    	Assert.assertTrue(unlinkRelatedBankAccountsModal.isModalPresent());
		unlinkRelatedBankAccountsModal.clickUnlinkButton();
		Assert.assertFalse(unlinkRelatedBankAccountsModal.isErrorMessageDisplayed());
    	Assert.assertFalse(unlinkRelatedBankAccountsModal.isModalPresent());
	}
	
	@When("^I accept the unlink related bank account success modal$")
	public void acceptUnlinkRelatedBankAccountSuccessModal()  {
		unlinkRelatedBankAccountsSuccessModal.waitForModalPresent();
    	Assert.assertTrue(unlinkRelatedBankAccountsSuccessModal.isModalPresent());
    	Assert.assertTrue(unlinkRelatedBankAccountsSuccessModal.isOkMessageDisplayed());
    	unlinkRelatedBankAccountsSuccessModal.clickSameTitularCheckbox();
    	unlinkRelatedBankAccountsSuccessModal.clickConfirmButton();
    	Assert.assertFalse(unlinkRelatedBankAccountsSuccessModal.isModalPresent());
    	Assert.assertTrue(userMainPage.isLogguedIn());
	}
	
	@Then("^I verify the bank account is not linked$")
	public void verifyUnlinkRelatedBankAccount()  {
		String accountNumber = (String) MyThreadLocal.get().getData("account");
		String accountName = (String) MyThreadLocal.get().getData("name");
		String accountBanck = (String) MyThreadLocal.get().getData("bank");
		try {
			relatedBankAccountsSection.unlikRelatedBankAccount(accountNumber, accountName, accountBanck);
	    	Assert.assertTrue(false, "The account is present");
		} catch (IllegalArgumentException e) {
	    	Assert.assertTrue(true);
		}
	}

}

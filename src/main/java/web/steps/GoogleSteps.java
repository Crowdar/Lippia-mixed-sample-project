package web.steps;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.PageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import web.pages.GoogleHomePage;
import web.pages.GoogleSearchResultPage;

public class GoogleSteps extends PageSteps {

    private GoogleHomePage homePage;
    private GoogleSearchResultPage searchResultPage;

    public GoogleSteps(SharedDriver driver) {
        super(driver);
        homePage = new GoogleHomePage(driver);
        searchResultPage = new GoogleSearchResultPage(driver);
    }

    @Given("The client is in google page")
    public void home() {
        homePage.go();
    }

    @When("The client search for word (.*)")
    public void search(String criteria) {
        homePage.enterSearchCriteria(criteria);
        homePage.clickSearchButton();
    }

    @Then("The client verify that results are shown properly")
    public void statVerfication() {
        Assert.assertTrue(!searchResultPage.getStats().isEmpty());
    }
}

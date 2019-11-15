package mobile.steps;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.PageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobile.pages.ApiDemoHome;
import org.testng.Assert;

public class ApkApiDemoSteps extends PageSteps {

    private ApiDemoHome apiDemoHome;

    public ApkApiDemoSteps(SharedDriver driver) {
        super(driver);
        apiDemoHome = new ApiDemoHome(driver);
    }

    @Given("The user opens the '(.*)' application")
    public void openAplication(String title) {
        Assert.assertEquals(apiDemoHome.getTitle(), title);
    }

    @When("The user clicks over '(.*)' menu element")
    public void executeAction(String menuElementName) {
        apiDemoHome.clickMenuElement(menuElementName);
    }

    @Then("The user sees the application '(.*)' open")
    public void openAssertion(String title) {
        Assert.assertEquals(apiDemoHome.getTitle(), title);
    }
}

package ar.api.steps;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.testng.Assert;

import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import com.google.common.base.Splitter;

import api.config.EntityConfiguration;
import api.model.Data;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UserSteps extends PageSteps {

	@Given("^As an api user for example endpoint$")
	public void asAnApiUserForExampleEndpoint() {
	}

	@When("^I perform a '(.*)' to '(.*)' endpoint with the '(.*)' and '(.*)'$")
	public void iPerformAGETToUsersEndpointWithTheIdId(String method, String entity, String jsonName,
			String jsonReplacementValues) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		Map<String, String> parameters = null;
		if (!jsonReplacementValues.isEmpty()) {
			parameters = Splitter.on(",").withKeyValueSeparator(":").split(jsonReplacementValues);
		}

		EntityConfiguration.valueOf(entity).getEntityService().getMethod(method.toLowerCase(), String.class, Map.class)
				.invoke("", jsonName, parameters);
	}

	@Then("^I will get the proper status code '(.*)'$")
	public void iWillGetTheProperStatusCodeStatusCode(String expStatusCode) {
		int actualStatusCode = APIManager.getLastResponse().getStatusCode();
		Assert.assertEquals(Integer.parseInt(expStatusCode), actualStatusCode, "The status code are not equals");
	}

	@And("^The proper '(.*)' '(.*)' returned in the response$")
	public void theProperIdReturnedInTheResponse(String property, String value) {
		if (!value.isEmpty()) {
			Data response = (Data) APIManager.getLastResponse().getResponse();
			Assert.assertEquals(String.valueOf(response.getUser().getId()), value,
					"The " + property + " is not in the response");
		}
	}
}

package ar.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;

import com.crowdar.driver.DriverManager;

public class Hooks {

	@Before()
	public void setScenario(Scenario scenario) {
		Logger.getRootLogger().info("-----------" + scenario.getName() + "-----------");
	}

	@After()
	public void dismissAll(Scenario scenario) {
		Logger.getRootLogger().info(" ending -----------" + scenario.getName() + "-----------");
		DriverManager.getDriverInstance().close();
	}
}

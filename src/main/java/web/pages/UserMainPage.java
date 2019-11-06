package web.pages;

import org.openqa.selenium.By;

import com.crowdar.bdd.cukes.SharedDriver;

public class UserMainPage extends CustomPageBase {
	
	private static final String USER_DROPDOWN_MENU = "#root > div > div.rightWrapper___3BEGM > div.container___22JrR > div.toolsWrapper___PMwOr > div.toolWrapper___2lZLi.hiddenMobile___3BDXr > div.profileMenuWrapper___33_DI > div > button";

	public UserMainPage(SharedDriver driver) {
		super(driver);
	}
	
	public boolean isLogguedIn() {
		return waitAndCheckElementPresent(By.cssSelector(USER_DROPDOWN_MENU));
	}
	
}

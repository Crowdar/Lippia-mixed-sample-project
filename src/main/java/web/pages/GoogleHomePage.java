package web.pages;

import com.crowdar.bdd.cukes.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends PageBaseGoogle {

    private final String GOOGLE_INPUT_XPATH = "//input[@class='gLFyf gsfi']";
    private final String GOOGLE_SEARCH_NAME = "btnK";

    private WebElement googleInput() {
        return getWebElement(By.xpath(GOOGLE_INPUT_XPATH));
    }

    private WebElement googleSearchBtn() {
        return getWebElement(By.name(GOOGLE_SEARCH_NAME));
    }

    public GoogleHomePage(SharedDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToIt();
    }

    public void enterSearchCriteria(String palabra) {
        googleInput().clear();
        googleInput().sendKeys(palabra);
    }

    public void clickSearchButton() {
        googleSearchBtn().click();
    }

}

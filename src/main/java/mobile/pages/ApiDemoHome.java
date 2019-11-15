package mobile.pages;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.mobile.core.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ApiDemoHome extends PageBase {

    private final String ACTION_BAR_VIEW_XPATH = "//*[@resource-id='android:id/action_bar']";
    private final String TITLE_TEXT_XPATH = "//android.widget.TextView";
    private final String MENU_TEXT_XPATH = "//android.widget.TextView[@content-desc=\"%s\"]";

    public ApiDemoHome(SharedDriver driver) {
        super(driver);
        this.url = "";
    }

    public String getTitle() {
        return getMobileElement(By.xpath(ACTION_BAR_VIEW_XPATH)).findElement(By.xpath(TITLE_TEXT_XPATH)).getText();
    }

    private WebElement getMenuElement(String menu) {
        return getMobileElement(By.xpath(String.format(MENU_TEXT_XPATH, menu)));
    }

    public void clickMenuElement(String menu) {
        WebElement element = getMenuElement(menu);
        element.click();
    }

}

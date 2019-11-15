package web.pages;

import com.crowdar.bdd.cukes.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchResultPage extends PageBaseGoogle {

    private final String STATS_ID = "resultStats";

    private WebElement stats() {
        return getWebElement(By.id(STATS_ID));
    }

    public GoogleSearchResultPage(SharedDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public String getStats() {
        return stats().getText();
    }

}

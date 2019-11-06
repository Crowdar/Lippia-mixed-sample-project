package web.pages;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.CucumberPageBase;
import com.crowdar.core.PropertyManager;

public class CustomPageBase extends CucumberPageBase {

    public CustomPageBase(SharedDriver driver){
        super( driver);
        BASE_URL = PropertyManager.getProperty("web.base.url");
    }


}

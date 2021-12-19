package actions;

import org.openqa.selenium.WebDriver;
import utils.JsonPropertiesUtil;

public class BaseAction {

    // Base elements

    WebDriver driver;

    public BaseAction(WebDriver driver) {
        this.driver = driver;
    }

    public void openApplication(String appName) {
        driver.get(JsonPropertiesUtil.getAppUrl(appName));
    }

}

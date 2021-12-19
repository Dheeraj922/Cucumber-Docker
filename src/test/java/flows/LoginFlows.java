package flows;

import actions.BaseAction;
import actions.HomePageAction;
import actions.LoginPageAction;
import core.browser.BrowserInit;
import org.openqa.selenium.WebDriver;
import utils.JsonPropertiesUtil;

public class LoginFlows {

    private WebDriver driver;
    private HomePageAction homePageAction;
    private LoginPageAction loginPageAction;
    private BaseAction baseAction;


    public LoginFlows() {
        this.driver = BrowserInit.getDriver();
//        this.homePageAction = new HomePageAction(driver);
        baseAction = new BaseAction(driver);
    }

    public void loginUser(String appName, String userId) {
        baseAction.openApplication(appName);
        homePageAction = new HomePageAction(driver);
        homePageAction.navigateToLogin();
        loginPageAction = new LoginPageAction(driver);
        loginPageAction.fillEmail(JsonPropertiesUtil.getUserEmail(userId));
        loginPageAction.fillPassword(JsonPropertiesUtil.getUserPassword(userId));
        loginPageAction.clickLogin();
        loginPageAction.verifyLoggedIn();
    }

    public void logoutUser(String appName, String userId) {
        baseAction.openApplication(appName);
        homePageAction = new HomePageAction(driver);
        homePageAction.navigateToLogin();
        loginPageAction = new LoginPageAction(driver);
        loginPageAction.fillEmail(JsonPropertiesUtil.getUserEmail(userId));
        loginPageAction.fillPassword(JsonPropertiesUtil.getUserPassword(userId));
        loginPageAction.clickLogin();
        loginPageAction.verifyLoggedIn();
    }


}

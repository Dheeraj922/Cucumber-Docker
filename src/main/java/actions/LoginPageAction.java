package actions;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.UserAccountPage;

public class LoginPageAction extends LoginPage {

    WebDriver driver;
    UserAccountPage userAccountPage;

    public LoginPageAction(WebDriver driver) {
        super(driver);
        userAccountPage = new UserAccountPage(driver);
    }

    public void fillEmail(String userEmail) {
        email.sendKeys(userEmail);
    }

    public void fillPassword(String userPass) {
        password.sendKeys(userPass);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void verifyLoggedIn() {
        userAccountPage.welcomeMessage.isDisplayed();
    }




}

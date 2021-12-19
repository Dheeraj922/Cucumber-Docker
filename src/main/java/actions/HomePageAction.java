package actions;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

public class HomePageAction extends HomePage {

    WebDriver driver;
    LoginPage loginPage;

    public HomePageAction(WebDriver driver) {
        super(driver);
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    public void navigateToLogin() {
//        myAccountDropdown.click();
        loginOption.click();
        assertThat(loginPage.email.isDisplayed()).isTrue().describedAs("Email field NOT present");
    }

    public void clickMyAccount() {
        myAccountDropdown.click();
    }

    public void clickLoginOption() {
        loginOption.click();
    }

    public boolean verifyLoginPageDisplayed() {
        boolean status = false;
        assertThat(loginPage.email.isDisplayed()).isTrue().describedAs("Email field NOT present");
        status = true;
        return status;
    }





}

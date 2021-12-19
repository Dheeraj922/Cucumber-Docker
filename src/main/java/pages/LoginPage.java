package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[type=\"email\"][name=\"email\"]")
    public WebElement email;

    @FindBy(css = "input[type=\"password\"][name=\"password\"]")
    public WebElement password;

    @FindBy(css = "input#remember-me")
    public WebElement rememberMe;

    @FindBy(xpath = "//span[text()='Login']/..")
    public WebElement loginButton;

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div.dropdown-login")
    protected WebElement myAccountDropdown;

//    @FindBy(css = "div.header-top-content > div > a[href=\"https://www.phptravels.net/login\"]")
    @FindBy(xpath = "//div[@class=\"header-top-content\"]/div/a[text()=\"Login\"]")
    protected WebElement loginOption;

    @FindBy(css = "div.dropdown-login div.dropdown-menu a:nth-child(2)")
    protected WebElement signupOption;


}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccountPage {

    public UserAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div.dashboard-bread > div > div.row.align-items-center > div:nth-child(1) > div > div > h2")
    public WebElement welcomeMessage;

}

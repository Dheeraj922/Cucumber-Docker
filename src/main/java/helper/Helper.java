package helper;

import core.browser.BrowserInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {

    static WebDriver driver = BrowserInit.getDriver();
    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public static void waitForElementToBeDisplayed(WebElement element) {
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementToBeDisplayed(By byLocator) {
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLocator));
    }

    public static void waitForElementToInvisible(By byLocator) {
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(byLocator));
    }

    public static void waitForElementToInvisible(WebElement element) {
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }



}

package hooks;

import enums.Browser;
import enums.ExecutionType;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import static core.browser.BrowserInit.getDriver;
import static core.browser.BrowserInit.initDriver;

public class Hooks {

    public WebDriver driver = getDriver();


    @Before()
    public void beforeScenario(Scenario scenario) {
        System.out.println("From before scenario");
        // LOCAL Execution
//        driver = initDriver(Browser.CHROME);

        // GRID Execution
        // Take input for browser Name from Config
        driver = initDriver(Browser.EDGE, ExecutionType.GRID);
    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("From After scenario");
        System.out.println(scenario.getStatus());

//        driver.manage().deleteAllCookies();
//        driver.get("chrome://settings/clearBrowserData");
//        driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        WebElement clearAll = (WebElement) jsExecutor.executeScript("return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#main\")" +
//                ".shadowRoot.querySelector(\"settings-basic-page\").shadowRoot.querySelector(\"#basicPage > settings-section:nth-child(8) > " +
//                "settings-privacy-page\").shadowRoot.querySelector(\"settings-clear-browsing-data-dialog\")" +
//                ".shadowRoot.querySelector(\"#clearBrowsingDataConfirm\")");
//        clearAll.click();
//        WebElement clearModal = (WebElement) jsExecutor.executeScript("return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#main\")" +
//                ".shadowRoot.querySelector(\"settings-basic-page\").shadowRoot.querySelector(\"#basicPage > settings-section:nth-child(8) > settings-privacy-page\")" +
//                ".shadowRoot.querySelector(\"settings-clear-browsing-data-dialog\").shadowRoot.querySelector(\"#clearBrowsingDataDialog\")" +
//                ".shadowRoot.querySelector(\"#content-wrapper\")");
//        waitForElementToInvisible(clearModal);
//        driver.navigate().refresh();
//        driver.get(PropertiesUtil.getAppProperty("baseUrl"));

        driver.quit();

    }

    @BeforeStep
    public void beforeStep(Scenario scenario) {
        System.out.println("From before step");
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        System.out.println("From after step");
    }



}

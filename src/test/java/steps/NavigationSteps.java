package steps;

import core.browser.BrowserInit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class NavigationSteps {
    @And("User reached to {string} page")
    public void userReachedToPage(String pageName) {

    }

    @Given("User navigates to {string} tab")
    public void userNavigatesToTab(String pageName) {
        switch (pageName) {
            case "FLIGHTS":
                BrowserInit.getDriver().get("https://google.com");
                break;
            case "HOTEL":
                BrowserInit.getDriver().get("https://amazon.com");
                break;
            case "RESORT":
                BrowserInit.getDriver().get("https://flipkart.com");
                break;
        }
    }
}

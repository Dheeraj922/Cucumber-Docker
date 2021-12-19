package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import java.net.MalformedURLException;
import java.net.UnknownHostException;


@CucumberOptions(features = "src/test/resources/features",
                glue = {"steps","hooks"},
                plugin = {"pretty","json:target/cucumber-reports/cucumber.json", "html:target/cucumber-html-reports"})
public class TestRunner extends AbstractTestNGCucumberTests {

    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() throws UnknownHostException, MalformedURLException {
        System.out.println("From TestNG Before Suite");
//        // LOCAL Execution
//        driver = initDriver(Browser.CHROME);
//
//        // GRID Execution
//        // Take input for browser Name from Config
////        driver = initDriver(Browser.CHROME, ExecutionType.GRID);

    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("From TestNG After Suite");
//        driver.quit();
    }


    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}

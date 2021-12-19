package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/features",
                glue = {"steps","hooks"},
                plugin = {"pretty","json:target/cucumber-reports/cucumber.json", "html:target/cucumber-html-reports"})
public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("From TestNG Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("From TestNG After Suite");
    }

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}

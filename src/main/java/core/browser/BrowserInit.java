package core.browser;

import enums.Browser;
import enums.ExecutionType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.time.Duration;

public class BrowserInit {

//    public static WebDriver driver;
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    public static WebDriver initDriver(Browser browser, ExecutionType... executionType) {

//        if (driver.get() != null) {
//            return driver.get();
//        }
        if (executionType.length > 0) {
            switch (executionType[0]) {
                case LOCAL:
                    switch (browser) {
                        case CHROME:
                            WebDriverManager.chromedriver().setup();
//                            driver = new ChromeDriver();
                            driver.set(new ChromeDriver());
                            break;
                        case FIREFOX:
                            WebDriverManager.firefoxdriver().setup();
//                            driver = new FirefoxDriver();
                            driver.set(new FirefoxDriver());
                            break;
                        case EDGE:
                            WebDriverManager.edgedriver().setup();
//                            driver = new EdgeDriver();
                            driver.set(new EdgeDriver());
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + browser);
                    }
                    break;
                case GRID:
                    DesiredCapabilities dc = new DesiredCapabilities();
                    String osName = System.getProperty("os.name");
                    if (osName.contains("Windows")) {
                        if (osName.equalsIgnoreCase("Windows 10")) {
                            dc.setPlatform(Platform.WIN10);
                        } else {
                            dc.setPlatform(Platform.WINDOWS);
                        }
                    } else if (osName.contains("mac")) {
                        dc.setPlatform(Platform.MAC);
                    } else if (osName.contains("linix")) {
                        dc.setPlatform(Platform.LINUX);
                    }
                    dc.setBrowserName("chrome");
                    InetAddress inetAddress = null;
                    try {
                        inetAddress = InetAddress.getLocalHost();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    }
                    URL url = null;
                    try {
                        String hostIpAddress = inetAddress.getHostAddress();
                        url = new URL("http://" + hostIpAddress + ":4444");

//                        url = new URL("http://localhost:32423/wd/hub");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }

//        System.setProperty("webdriver.chrome.driver","/Users/nitinkumar/Documents/Personal/Learning/chromedriver");
//                    driver = new RemoteWebDriver(url, dc);
                    driver.set(new RemoteWebDriver(url, dc));
                    break;
            }
        } else {
            switch (browser) {
                case CHROME:
                    WebDriverManager.chromedriver().setup();
//                            driver = new ChromeDriver();
                    driver.set(new ChromeDriver());
                    break;
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
//                            driver = new FirefoxDriver();
                    driver.set(new FirefoxDriver());
                    break;
                case EDGE:
                    WebDriverManager.edgedriver().setup();
//                            driver = new EdgeDriver();
                    driver.set(new EdgeDriver());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + browser);
            }
        }

        driver.get().manage().window().maximize();
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get(PropertiesUtil.getAppProperty("baseUrl"));
        return driver.get();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}

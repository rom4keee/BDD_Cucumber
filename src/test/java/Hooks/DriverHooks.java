package Hooks;
import Driver.WDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class DriverHooks {
    protected static WebDriver driver;
    protected static String HOME_PAGE_URL = "https://www.bookdepository.com/";

    @Before
    public void setUpTest() {
        WDriver.getWebDriverInstance();
        driver = WDriver.getDriver();
        driver.navigate().to(HOME_PAGE_URL);
    }

    @After
    public void quitDriver() {
        WDriver.quitDriver();
    }
}

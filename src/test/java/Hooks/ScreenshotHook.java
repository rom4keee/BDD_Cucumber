package Hooks;

import Driver.WDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.sql.DriverManager;

public class ScreenshotHook {
    public static final String FILE_EXTENSION = "image/png/jpeg";

    @After
    public void Screenshot(Scenario scenario) {
        scenario.getUri(DriverManager.getDriver() .getCurrentUrl());

        byte[] screenshot = ((TakesScreenshot) WDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, FILE_EXTENSION, scenario.getName());
    }
}

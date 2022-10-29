package CucumberRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith (Cucumber.class)

@CucumberOptions(
        plugin = {"pretty", "html:src/target/cucumber-reports"},
        monochrome = true,
        tags = "@payment_page",
        glue = "cucumber.steps",
        features = "src/test/resources/cucumber"
)

public class CucumberTestRunner {

}



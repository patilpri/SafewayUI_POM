import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"steps"},
        tags = {"@sc1"},

        plugin = {
                "pretty"
        })
public class CucumberTest extends AbstractTestNGCucumberTests {

}

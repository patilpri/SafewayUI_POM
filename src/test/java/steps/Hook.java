package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BasePageSteps{
    private final BasePageSteps basePageSteps;

    public Hook(BasePageSteps basePageSteps) {
        this.basePageSteps = basePageSteps;
    }
    @Before
    public void startUp(Scenario scenario) throws Exception {
       // basePageSteps.webDriver = BrowserFactory.getBrowser(System.getProperty("browser"));
        String browser = System.getProperty("browser","chrome");
        if(browser.contains("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ppati09\\Downloads\\chromedriver105\\chromedriver.exe");
            basePageSteps.webDriver = new ChromeDriver();
        }
    }
    @After
    public void tearDown(Scenario scenario) {
        basePageSteps.webDriver.quit();
    }
}

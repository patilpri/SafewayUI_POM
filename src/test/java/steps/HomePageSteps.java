package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.SafewayHomePage;

public class HomePageSteps {
    private final WebDriver driver;
    public pages.SafewayHomePage SafewayHomePage;

    public HomePageSteps(BasePageSteps basePageSteps){
        this.driver = basePageSteps.webDriver;
        SafewayHomePage = new SafewayHomePage(driver);
    }
    @Given("I go to Safeway HomePage")
    public void i_go_to_Safeway_HomePage() {
        System.out.println("testhy");
        SafewayHomePage.goToSafewayHomepage();
        System.out.println("testq");
    }
}

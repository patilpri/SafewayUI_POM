package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SafewayHomePage;
import pages.SafewaySignInPage;

public class SignInPageSteps {
    private final WebDriver driver;
    public pages.SafewayHomePage SafewayHomePage;
    public pages.SafewaySignInPage safewaySignInPage;

    public SignInPageSteps(BasePageSteps basePageSteps){
        this.driver = basePageSteps.webDriver;
        SafewayHomePage = new SafewayHomePage(driver);
        safewaySignInPage = new SafewaySignInPage(driver);
    }
    @Given("go to SignIn Page")
    public void go_to_SignIn_Page() throws Throwable{
        SafewayHomePage.goToSignInPage();
        System.out.println("test1");
    }

    @When("I enter {string} credentials")
    public void i_enter_credentials(String string)  throws Throwable{
        System.out.println("test2");
    }

    @Then("User should be redirected to HomePage")
    public void user_should_be_redirected_to_HomePage() throws Throwable {
        System.out.println("test3");
    }

    @Then("User first name should be displayed on top")
    public void user_first_name_should_be_displayed_on_top() throws Throwable {
        System.out.println("test4");
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SafewayHomePage extends BasePageObject{
    @FindBy(xpath = "//a[@class='menu-nav__profile-button']")
    private static WebElement signindropdown;
    @FindBy(id = "sign-in-modal-link")
    private static WebElement signinLink;


    private WebDriver driver;
    public SafewayHomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void goToSignInPage(){
        signindropdown.click();
        signinLink.click();

    }
    public void goToSafewayHomepage(){
        driver.navigate().to("https://www.safeway.com/");
    }
}

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
    @FindBy(id = "label-email")
    private static WebElement email;
    @FindBy(id = "label-password")
    private static WebElement password;
    @FindBy(id = "btnSignIn")
    private static WebElement SIGNIN_BTN;

    private WebDriver driver;
    public SafewayHomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}

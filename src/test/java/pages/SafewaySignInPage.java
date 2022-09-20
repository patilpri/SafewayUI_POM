package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SafewaySignInPage extends BasePageObject{
    @FindBy(id = "label-email")
    private static WebElement email;
    @FindBy(id = "label-password")
    private static WebElement password;
    @FindBy(id = "btnSignIn")
    private static WebElement SIGNIN_BTN;

    private WebDriver driver;
    public SafewaySignInPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}

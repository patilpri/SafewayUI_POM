package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelpHooks {
    public WebDriver setSysProperty(WebDriver driver){
        String browser = System.getProperty("broswer","chrome");
        if(browser.contains("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ppati09\\Downloads\\chromedriver105\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.contains("firefox")){
            System.setProperty("webdriver.gecko.driver", "<Gecko Driver executable location on your system>");
            driver = new FirefoxDriver();
        }
        return driver;
    }
}

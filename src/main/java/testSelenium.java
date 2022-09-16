

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSelenium {

    public static void main(String[] args) throws InterruptedException {

        //Instantiating chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ppati09\\Downloads\\chromedriver105\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Opening web application
        driver.get("https://www.safeway.com/");

        //Locating the Login button and clicking on it
        driver.findElement(By.xpath("//a[@class='menu-nav__profile-button']")).click();
        driver.findElement(By.id("sign-in-modal-link")).click();

        //Locating the username & password and passing the credentials
        driver.findElement(By.id("label-email")).sendKeys("gunjankaushik");
        driver.findElement(By.id("label-password")).sendKeys("Password@123");

        //Click on the login button
        driver.findElement(By.id("btnSignIn")).click();

        //Close driver instance
        driver.quit();
    }

}

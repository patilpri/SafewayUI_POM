package pages;

import org.openqa.selenium.WebDriver;

public class BasePageObject {
    //private static final Logger logger = Logger.getLogger(BasePageObject.class);

    private WebDriver driver;

    public BasePageObject(WebDriver driver){
        //PropertyConfigurator.configure("log4j.properties");
        this.driver = driver;
    }
/*
    public void logReport(Status status, String message){
        ExtentReportUtil.getExtentReportUtil().reportExecutionStatus(status, message);
    }
 */
}

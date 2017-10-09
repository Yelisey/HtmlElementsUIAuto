package driver;

import Utility.Constants;
import Utility.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;


public class Browser {

    private static WebDriver driver = null;

    public static WebDriver getDriver(String browserType){
        switch (browserType) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "chrome":
                String driverPath = Utils.getPath(Constants.PARAM_DIR + File.separator +
                        Constants.DRIVER_DIR + File.separator + "chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", driverPath);
                driver = new ChromeDriver();
                break;
        }
        return driver;
    }
}
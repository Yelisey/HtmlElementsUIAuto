package driver;

import Utility.Constants;
import Utility.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;


public class Browser {

    public static WebDriver driver = null;


    public static WebDriver getIE() {
        driver = new InternetExplorerDriver();
        return driver;
    }

    public static WebDriver getFirefox() {
        driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver getChrome() {
        String driverPath = Utils.getPath(Constants.PARAM_DIR + File.separator +
                Constants.DRIVER_DIR + File.separator + "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        return driver;
    }
}
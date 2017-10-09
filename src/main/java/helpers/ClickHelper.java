package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickHelper {

    WebDriver driver;

    public ClickHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void click(WebElement webElement){
        webElement.click();
    }
}

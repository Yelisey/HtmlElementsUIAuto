package MainPage;


import driver.Browser;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestFirst {

    @Test
    public void test_first(){
        WebDriver driver = Browser.getChrome();
        driver.get("https://www.findx.com/");
    }
}

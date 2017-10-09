package test;

import driver.BrowserInitialize;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.MainPage;

public class MainPageTest {

    private WebDriver driver;

    @Parameters({"browserType"})
    @BeforeClass
    public void setUp(String browser) {
        driver = BrowserInitialize.getDriver(browser);
        driver.get("https://www.findx.com/");
    }

    @Test
    public void testSearch() {
        MainPage mainPage = new MainPage(driver);
        mainPage.search("yandex");
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}

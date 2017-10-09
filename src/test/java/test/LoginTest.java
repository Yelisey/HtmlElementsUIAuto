package test;

import driver.BrowserInitialize;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import page.SearchPage;

public class LoginTest {

    private WebDriver driver;

    @Parameters({"browserType"})
    @BeforeClass
    public void setUp(String browser) {
        driver = BrowserInitialize.getDriver(browser);
        driver.get("http://www.yandex.com");
    }

    @Test
    public void sampleTest() {
        SearchPage loginPage = new SearchPage(driver);
        loginPage.search("yandex");
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
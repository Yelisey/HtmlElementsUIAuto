package test;

import driver.BrowserInitialize;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import page.SearchPage;

public class SearchTest {

    private WebDriver driver;

    @Parameters({"browserType"})
    @BeforeClass
    public void setUp(String browser) {
        driver = BrowserInitialize.getDriver(browser);
        driver.get("http://www.yandex.com");
    }

    @Test
    public void sampleTest() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.search("yandex");
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
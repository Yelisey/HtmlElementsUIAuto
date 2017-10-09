package test;


import driver.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import page.LoginPage;

import java.io.FileNotFoundException;


public class LoginTest {
    private WebDriver driver;

    @Parameters({"browserType", "browserVersion", "appURL" })
    @BeforeClass
    public void setUp() {
        driver = Browser.getChrome();
    }

    @Test(priority = 1)
    public void testLogin() throws FileNotFoundException, InterruptedException {
        LoginPage loginPage = new LoginPage(this.driver);
    }

    @AfterClass
    public void tearDown() {
        this.driver.quit();
    }
}
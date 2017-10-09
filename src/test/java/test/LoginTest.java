package test;

import driver.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import page.LoginPage;

import java.io.FileNotFoundException;


public class LoginTest {

    private WebDriver driver;

    @Parameters({"browserType"})
    @BeforeClass
    public void setUp(String browser) {
        driver = Browser.getDriver(browser);
    }

    @Test(priority = 1)
    public void testLogin() throws FileNotFoundException, InterruptedException {
        LoginPage loginPage = new LoginPage(this.driver);
        loginPage.open_login_page();

    }

    @AfterClass
    public void tearDown() {
        this.driver.quit();
    }
}
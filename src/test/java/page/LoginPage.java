package page;


import org.openqa.selenium.WebDriver;

public class LoginPage {

    protected WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open_login_page(){
        driver.get("https://www.findx.com/");
    }
}

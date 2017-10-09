package page;


import element.MainPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class MainPage {
    private MainPageElements mainPageElement;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }

    public void search(String request) {
        mainPageElement.search(request);
        mainPageElement.checkButton();
        mainPageElement.checkText(request);
    }

}

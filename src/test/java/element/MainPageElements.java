package element;


import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;


@Name("Search form")
@FindBy(xpath = "//form")
public class MainPageElements extends HtmlElement {

    @Name("Search request input")
    @FindBy(xpath = LocatorData.REQUEST_INPUT_XPATH)
    private TextInput requestInput;

    @Name("Search button")
    @FindBy(xpath = LocatorData.SEARCH_BUTTON_XPATH)
    private Button searchButton;

    @Name("Tab button Web")
    @FindBy(xpath = LocatorData.WEB_TAB_BUTTON)
    private Button tabButon;


    public void search(String request) {
        requestInput.sendKeys(request);
        searchButton.click();
    }

    public void click (){
        for(int i = 0; i < 100; i++){
            searchButton.click();
        }
    }

    public void checkText(String request){
        Assert.assertEquals(requestInput.getText(), request);
    }


    public void checkButton(){
        tabButon.exists();
    }
}

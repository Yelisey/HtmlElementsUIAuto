package element;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;


@Name("Search form")
@FindBy(xpath = "//form")
public class SearchArrow extends HtmlElement {

    @Name("Search request input")
    @FindBy(xpath = SearchArrowData.REQUEST_INPUT_XPATH)
    private TextInput requestInput;

    @Name("Search button")
    @FindBy(xpath = SearchArrowData.SEARCH_BUTTON_XPATH)
    private Button searchButton;

    public void search(String request) {
        requestInput.sendKeys(request);
        searchButton.click();
    }
}

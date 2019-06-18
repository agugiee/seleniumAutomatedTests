package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskOnePage {

    @FindBy(xpath = "//ul//li[text()[contains(.,'Zadanie 1')]]")
    private WebElement taskOneHeader;

    public WebElement getTaskOneHeader() {
        return taskOneHeader;
    }
}

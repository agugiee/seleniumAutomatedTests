package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task2_Page extends BasePage {

    public Task2_Page() {
        super();
    }

    @FindBy(xpath = "//form[@id='checkboxes']/input[@type='checkbox'][1]")
    private WebElement checkbox_first;

    @FindBy(xpath = "//h3[text()='Checkboxes']")
    private WebElement checkboxHeader;

    @FindBy(xpath = "//form[@id='checkboxes']/input[@type='checkbox'][2]")
    private WebElement checkbox_second;

    public WebElement getCheckbox_first() {
        return checkbox_first;
    }

    public WebElement getCheckbox_second() {
        return checkbox_second;
    }

    public boolean isCheckboxHeaderDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        return checkboxHeader.isDisplayed();
    }

    public boolean isChecboxFirstDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        return checkbox_first.isDisplayed();
    }

    public boolean isChecboxSecondDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        return checkbox_second.isDisplayed();
    }

    public boolean isCheckboxSelected(WebElement element) {
        boolean valueOfCheckbox = element.isSelected();
        return valueOfCheckbox;
    }
}

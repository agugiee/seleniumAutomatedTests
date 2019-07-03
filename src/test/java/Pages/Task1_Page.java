package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task1_Page extends BasePage {

    public Task1_Page() {
        super();
    }

    @FindBy(xpath = "//div[@class='example']//button")
    private WebElement addButton;

    @FindBy(xpath = "//div[@id='elements']//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//h3[text()='Add/Remove Elements']")
    private WebElement taskOneHeader;

    public boolean checkTaskOneHeaderIsDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        return taskOneHeader.isDisplayed();
    }

    public void clickAddButton() throws InterruptedException {
        addButton.isDisplayed();
        addButton.click();
        Thread.sleep(1500);
    }

    public void clickDeleteButton() throws InterruptedException {
        deleteButton.isDisplayed();
        deleteButton.click();
        Thread.sleep(1500);
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }
}

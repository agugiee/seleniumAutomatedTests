package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage() {
        super();
    }

    @FindBy(xpath = "//a[contains(@href, '/floating_menu')]")
    private WebElement floatingMenuTask;

    @FindBy(xpath = "//a[contains(@href, '/checkboxes')]")
    private WebElement taskSecondHeader;

    @FindBy(xpath = "//a[contains(@href, '/add_remove_elements')]")
    private WebElement taskOneHeader;

    public Task1_Page openTaskFirst() throws InterruptedException {
        Thread.sleep(5000);
        taskOneHeader.isDisplayed();
        taskOneHeader.click();

        return new Task1_Page();
    }

    public Task2_Page openSecondTask() throws InterruptedException {
        Thread.sleep(5000);
        taskSecondHeader.isDisplayed();
        taskSecondHeader.click();

        return new Task2_Page();
    }

    public Task3_Page openFloatingMenuTask() throws InterruptedException {
        Thread.sleep(5000);
        floatingMenuTask.isDisplayed();
        floatingMenuTask.click();

        return new Task3_Page();
    }
}

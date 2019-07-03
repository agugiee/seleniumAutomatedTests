package Tests;

import Pages.HomePage;
import Pages.Task1_Page;
import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_Tests extends TestConfig {

    // MARK: - Properties

    WebDriver driver;

    private HomePage homePage;
    private Task1_Page taskOnePage;

    // MARK: - Test cases

    @Test
    public void addAndDeleteElementsTest() throws InterruptedException {
        homePage.openTaskFirst();
        taskOnePage.checkTaskOneHeaderisDisplayed();
        taskOnePage.clickAddButton();
        WebElement addButton = taskOnePage.getAddButton();
        taskOnePage.clickDeleteButton();
        WebElement deleteButton = taskOnePage.getDeleteButton();
        Assert.assertTrue(addButton.isDisplayed());
        Assert.assertFalse(!deleteButton.isDisplayed());
    }
}

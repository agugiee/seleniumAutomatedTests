package Tests;

import Pages.HomePage;
import Pages.Task1_Page;
import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1_Tests extends TestConfig {

    // MARK: - Properties

    HomePage homePage = new HomePage();
    Task1_Page taskOnePage = new Task1_Page();

    // MARK: - Test cases

    @Test
    public void addAndDeleteElementsTest() throws InterruptedException {
        homePage.openTaskFirst();
        taskOnePage.checkTaskOneHeaderIsDisplayed();
        taskOnePage.clickAddButton();
        WebElement addButton = taskOnePage.getAddButton();
        taskOnePage.clickDeleteButton();
        WebElement deleteButton = taskOnePage.getDeleteButton();


        Assert.assertTrue(addButton.isDisplayed());
        Assert.assertFalse(isElementPresent(By.xpath("//div[@id='elements']//button")));
    }

    // MARK: - Private methods

    public boolean isElementPresent(By locatorKey) {
        try {
            driver.findElement(locatorKey);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}

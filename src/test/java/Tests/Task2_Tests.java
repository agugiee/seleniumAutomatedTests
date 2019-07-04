package Tests;

import Pages.HomePage;
import Pages.Task2_Page;
import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Task2_Tests extends TestConfig {

    // MARK: - Properties

    HomePage homePage = new HomePage();
    Task2_Page taskTwoPage = new Task2_Page();

    // MARK: - Test cases

    @Test
    public void checkboxesBasedSettingsTest() throws InterruptedException {
        homePage.openSecondTask();
        taskTwoPage.isCheckboxHeaderDisplayed();
        Assert.assertTrue(taskTwoPage.isChecboxFirstDisplayed());
        Assert.assertTrue(taskTwoPage.isChecboxSecondDisplayed());

        Assert.assertFalse(taskTwoPage.isCheckboxSelected(taskTwoPage.getCheckbox_first()));
        Assert.assertTrue(taskTwoPage.isCheckboxSelected(taskTwoPage.getCheckbox_second()));
    }

    @Test
    public void switchBothCheckboxesOffTest() throws InterruptedException {
        homePage.openSecondTask();
        taskTwoPage.isCheckboxHeaderDisplayed();

        Assert.assertTrue(taskTwoPage.isChecboxFirstDisplayed());
        Assert.assertTrue(taskTwoPage.isChecboxSecondDisplayed());

        Thread.sleep(1500);

        WebElement checkbox_second = taskTwoPage.getCheckbox_second();
        checkbox_second.click();

        Thread.sleep(1500);

        Assert.assertFalse(taskTwoPage.isCheckboxSelected(taskTwoPage.getCheckbox_first()));
        Assert.assertFalse(taskTwoPage.isCheckboxSelected(taskTwoPage.getCheckbox_second()));
    }
}

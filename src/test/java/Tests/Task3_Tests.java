package Tests;

import Pages.HomePage;
import Pages.Task3_Page;
import config.TestConfig;
import org.junit.Assert;
import org.junit.Test;

public class Task3_Tests extends TestConfig {

    // MARK: - Properties

    HomePage homePage = new HomePage();
    Task3_Page taskFloatingMenuPage = new Task3_Page();

    // MARK: - Test cases

    @Test
    public void checkMenuIsStillDisplayed() throws InterruptedException {
        homePage.openFloatingMenuTask();
        taskFloatingMenuPage.isFloatingMenuHeaderDisplayed();
        taskFloatingMenuPage.isNewsButtonDisplayed();

        Thread.sleep(1500);

        actions.moveToElement(taskFloatingMenuPage.getParagraphElement()).click().perform();

        Thread.sleep(1500);

        Assert.assertTrue(taskFloatingMenuPage.isNewsButtonDisplayed());
    }
}

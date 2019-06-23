package Tests;

import Pages.HomePage;
import Pages.Task3_Page;
import config.TestConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Task3_Tests extends TestConfig {

    // MARK: - Properties

    WebDriver driver;
    Actions actions;

    private HomePage homePage;
    private Task3_Page taskFloatingMenuPage;

    // MARK: - Lifecycle

    @Before
    public void setUp() {
        System.setProperty("Webdriver ChromeDriver", "C:\\Users\\Aga\\Desktop\\FirstTestWeb\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get("http://the-internet.herokuapp.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

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

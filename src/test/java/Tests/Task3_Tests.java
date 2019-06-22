package Tests;

import config.TestConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Task3_Tests extends TestConfig {

    // MARK: - Properties

    WebDriver driver;
    Actions actions;

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
        WebElement floatingMenuTask = driver.findElement(By.xpath("//a[contains(@href, '/floating_menu')]"));
        floatingMenuTask.isDisplayed();
        floatingMenuTask.click();

        WebElement menuHeader = driver.findElement(By.xpath("//h3[text()='Floating Menu']"));
        Thread.sleep(1500);
        Assert.assertTrue(menuHeader.isDisplayed());

        WebElement newsButton = driver.findElement(By.xpath("//a[@href='#news']"));
        Assert.assertTrue(newsButton.isDisplayed());

        Thread.sleep(1500);


        WebElement paragraph = driver.findElement(By.xpath("//p[3]"));
        actions.moveToElement(paragraph).click().perform();

        Thread.sleep(1500);

        Assert.assertTrue(newsButton.isDisplayed());
    }
}

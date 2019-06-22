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

import java.util.concurrent.TimeUnit;

public class Task2_Tests extends TestConfig {

    // MARK: - Properties

    WebDriver driver;

    // MARK: - Lifecycle

    @Before
    public void setUp() {
        System.setProperty("Webdriver ChromeDriver", "C:\\Users\\Aga\\Desktop\\FirstTestWeb\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
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
    public void checkboxesTest() throws InterruptedException {
        this.tapCheckboxTask();
        this.isCheckboxTaskHeaderDisplayed();

        WebElement checkbox_first = driver.findElement(By.xpath("//form[@id='checkboxes']/input[@type='checkbox'][1]"));
        WebElement checkbox_second = driver.findElement(By.xpath("//form[@id='checkboxes']/input[@type='checkbox'][2]"));

        checkbox_first.isDisplayed();
        checkbox_second.isDisplayed();

        Assert.assertFalse(this.isCheckboxSelected(checkbox_first));
        Assert.assertTrue(this.isCheckboxSelected(checkbox_second));
    }

    @Test
    public void switchBothCheckboxesOffTest() throws InterruptedException {
        this.tapCheckboxTask();
        this.isCheckboxTaskHeaderDisplayed();

        WebElement checkbox_first = driver.findElement(By.xpath("//form[@id='checkboxes']/input[@type='checkbox'][1]"));
        WebElement checkbox_second = driver.findElement(By.xpath("//form[@id='checkboxes']/input[@type='checkbox'][2]"));

        checkbox_first.isDisplayed();
        checkbox_second.isDisplayed();

        Thread.sleep(1500);

        checkbox_second.click();

        Thread.sleep(1500);

        Assert.assertFalse(this.isCheckboxSelected(checkbox_first));
        Assert.assertFalse(this.isCheckboxSelected(checkbox_second));
    }

    // MARK: - Private methods

    private void tapCheckboxTask() {
        WebElement checkboxesTask = driver.findElement(By.xpath("//a[contains(@href, '/checkboxes')]"));
        checkboxesTask.isDisplayed();
        checkboxesTask.click();
    }

    private void isCheckboxTaskHeaderDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        WebElement checkboxesTaskHeader = driver.findElement(By.xpath("//h3[text()='Checkboxes']"));
        Assert.assertTrue(checkboxesTaskHeader.isDisplayed());
    }

    private boolean isCheckboxSelected(WebElement element) {
        boolean valueOfCheckbox = element.isSelected();
        return valueOfCheckbox;
    }
}

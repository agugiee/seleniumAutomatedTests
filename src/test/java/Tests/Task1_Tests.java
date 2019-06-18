package Tests;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task1_Tests {

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
//        driver.get("https://facebook.com");
//          driver.get("https://google.com");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    // MARK: - Test cases

    @Test
    public void addAndDeleteElementsTest() throws InterruptedException {
        WebElement addRemoveTask = driver.findElement(By.xpath("//a[contains(@href, '/add_remove_elements')]"));
        addRemoveTask.isDisplayed();
        addRemoveTask.click();

        Thread.sleep(5000);
        WebElement addRemoveTaskHeader = driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));
        Assert.assertTrue(addRemoveTaskHeader.isDisplayed());

        WebElement addButton = driver.findElement(By.xpath("//div[@class='example']//button"));
        addButton.isDisplayed();
        addButton.click();
        Thread.sleep(1500);

        WebElement deleteButton = driver.findElement(By.xpath("//div[@id='elements']//button"));
        Assert.assertTrue(deleteButton.isDisplayed());
        Thread.sleep(1500);

        deleteButton.click();
        Thread.sleep(1500);
    }

    public void userRegistrationWithValidData() throws InterruptedException {
        Actions actions = new Actions(driver);

//        WebElement summaryQuantity = driver.findElement((By.xpath("//span[@class='summary-quantity']")));
        String amountOfProduct = "50";
        WebElement google = driver.findElement(By.xpath("//h4[text()='Okulary']"));

        WebElement inputGooglePrice = driver.findElement(By.xpath("//h4[text()='Piłka']/following-sibling::div[@class='input-group input-group-sm']//input"));
        WebElement inputHeadSet = driver.findElement(By.xpath("//h4[text()='Słuchawki']/following-sibling::div[@class='input-group input-group-sm']//input"));

        actions.moveToElement(inputHeadSet).build().perform();
//        actions.moveToElement(google).clickAndHold().perform();

        Thread.sleep(5000);


        inputGooglePrice.click();
        inputGooglePrice.clear();
        inputGooglePrice.sendKeys(amountOfProduct);

//        driver.switchTo().defaultContent();

        Thread.sleep(5000);

        inputHeadSet.click();
        inputHeadSet.clear();
        inputHeadSet.sendKeys(amountOfProduct);

        Thread.sleep(5000);
//        WebElement addButtonGoogle = driver.findElement(By.xpath("//button[@id='add-product-5d092e4a64bc5']"));
        WebElement pilka = driver.findElement(By.id("add-product-5d07df3a2d1fe"));

        driver.switchTo().frame(pilka);

        pilka.isDisplayed();
        pilka.isEnabled();
        pilka.click();

        Thread.sleep(5000);
//
//        actions.moveToElement(addButtonGoogle).build().perform();
//        addButtonGoogle.click();
//
//        Thread.sleep(5000);




//        WebElement inputGooglePrice = driver.findElement(By.xpath("//h4[text()='Okulary']/following-sibling::div[@class='input-group input-group-sm']//input"));

//        Thread.sleep(5000);
//        inputGooglePrice.click();
//        inputGooglePrice.clear();
//        inputGooglePrice.sendKeys(amountOfProduct);

//        this.searchElementInputAndTypeValue(inputGooglePrice, amountOfProduct);
//        actions.moveToElement(addButtonGoogle).perform();
//        addButtonGoogle.click();
//        this.tapAddButton(addButtonGoogle);
//        String basketSummary = summaryQuantity.getText();
//        Assert.assertEquals(basketSummary, summaryQuantity);


//        WebElement cenaGoogle = google.findElement(By.xpath("/following-sibling::p[text()='Cena: 15.54 zł']"));



    }

    // MARK: - Private methods
}

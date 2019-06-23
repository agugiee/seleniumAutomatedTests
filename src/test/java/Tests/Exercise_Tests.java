package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Exercise_Tests {

    WebDriver driver;

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
}

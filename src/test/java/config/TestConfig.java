package config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static config.WebDriverSingleton.getInstance;
import static config.WebDriverSingleton.quit;

public class TestConfig {

    public Actions actions;
    public WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("Webdriver ChromeDriver", "C:\\Users\\Aga\\Desktop\\FirstTestWeb\\src\\test\\java\\chromedriver.exe");

        String baseURL = "http://the-internet.herokuapp.com/";

        driver = getInstance();
        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get(baseURL);
    }

    @After
    public void tearDown() {
        quit();
    }
}

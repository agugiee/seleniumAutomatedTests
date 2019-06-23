package Pages;

import org.openqa.selenium.support.PageFactory;

import static config.WebDriverSingleton.getInstance;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(getInstance(), this);
    }
}

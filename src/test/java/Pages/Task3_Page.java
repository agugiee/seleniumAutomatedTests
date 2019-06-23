package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task3_Page extends BasePage {

    public Task3_Page() {
        super();
    }

    @FindBy(xpath = "//h3[text()='Floating Menu']")
    private WebElement floatingMenuHeader;

    @FindBy(xpath = "//a[@href='#news']")
    private WebElement newsButton;

    @FindBy(xpath = "//p[3]")
    private WebElement paragraph;

    public WebElement getParagraphElement() {
        return paragraph;
    }

    public boolean isFloatingMenuHeaderDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        return floatingMenuHeader.isDisplayed();
    }

    public boolean isNewsButtonDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        return newsButton.isDisplayed();
    }
}

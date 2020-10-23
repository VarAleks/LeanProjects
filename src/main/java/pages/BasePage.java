package pages;

import classes.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    public Browser getBrowser() {
        return browser;
    }

    protected Browser browser;

    public BasePage(Browser browser) {
        this.browser = browser;
    }

    public WebElement findElement(By by) {
        return browser.getDriver().findElement(by);
    }
    public void clickElement(By by) {
        findElement(by).click();
    }

    public void setText(By by, String text) {
        WebElement elem = findElement(by);
        elem.clear();
        elem.sendKeys(text);
    }
}

package pages;

import classes.Browser;
import classes.Locators;

public class MainPage extends BasePage {
    protected String url;
    public MainPage(Browser browser) {
        super(browser);
        url = "yandex.ru";
    }

    public void open() {
        browser.getDriver().get("http://" + url);
    }

    public void clickMarket() {
        clickElement(Locators.MainPage.MARKET_LINK);
        browser.switchToEndTab();
    }
}

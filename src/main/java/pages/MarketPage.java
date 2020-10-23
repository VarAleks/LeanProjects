package pages;

import classes.Browser;
import classes.Locators;

public class MarketPage extends MainPage {
    public MarketPage(Browser browser) {
        super(browser);
        url = "market." + url;
    }

    public void setFindText(String text) {
        setText(Locators.MarketPage.SEARCH_INPUT, text);
    }

    public void clickFindBtn() {
        clickElement(Locators.MarketPage.SEARCH_BUTTON);
    }

    public void setOffersFirst() {
        clickElement(Locators.MarketPage.LOCAL_OFFERS_FIRST);
    }
}

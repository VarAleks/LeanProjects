package classes;

import org.openqa.selenium.By;

public class Locators {
    public static class MainPage {
        public static final By MARKET_LINK = new By.ByCssSelector("[data-id='market']");
    }
    public static class MarketPage {
        public static final By SEARCH_INPUT = new By.ById("header-search");
        public static final By SEARCH_BUTTON = new By.ByCssSelector("[data-apiary-widget-name='@MarketNode/HeaderSearch'] button[type='submit']");
        public static final By LOCAL_OFFERS_FIRST = new By.ByCssSelector("[for='local-offers-first']");
    }
}

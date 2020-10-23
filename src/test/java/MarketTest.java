import org.junit.Test;
import pages.MainPage;
import pages.MarketPage;

/**
 * Тестирование страницы яндекс маркета
 */
public class MarketTest extends TestBase {

    /**
     * Тестирование открытия страницы и нажатия на клавишу поиска
     */
    @Test
    public void testMarketOpen() {
        MarketPage marketPage = new MarketPage(browser);
        MainPage mainPage = new MainPage(browser);

        mainPage.open();
        mainPage.clickMarket();
        marketPage.setFindText("xiaomi redminote");
        marketPage.clickFindBtn();
        marketPage.setOffersFirst();
        marketPage.getBrowser().takeScreenshot();
    }
}

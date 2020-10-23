import classes.Browser;
import org.junit.After;
import org.junit.Before;

public class TestBase {
    protected Browser browser;

    @Before
    public void beforeTest() {
        browser = new Browser();
    }

    @After
    public void afterTest() {
        browser.close();
    }
}

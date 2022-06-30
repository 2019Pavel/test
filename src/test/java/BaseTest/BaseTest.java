package BaseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static browser.Browser.*;
import static browser.BrowserFactory.getBrowser;
import static constants.Constants.*;

public class BaseTest {
    @BeforeMethod
    public void setPreconditions() {
        getBrowser(BROWSER, BROWSER_OPTIONS);
        goTo(BASE_URL);
    }

    @AfterMethod
    public void setPostConditions() {
        if(getDriver() != null) {
            quitDriver();
        }
    }
}

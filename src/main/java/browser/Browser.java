package browser;

import org.openqa.selenium.WebDriver;

import java.util.List;

public class Browser {
    private static String browserName;
    private static List<String> browserOptions;
    private static WebDriver driver;

    public Browser(String nameOfBrowser, List<String> optionsOfBrowser) {
        browserName = nameOfBrowser;
        browserOptions = optionsOfBrowser;
    }

    public void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }

    public static void goTo(String url) {
        driver.navigate().to(url);
    }
}

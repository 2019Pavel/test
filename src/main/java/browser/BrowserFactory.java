package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.List;

public class BrowserFactory {
    private static Browser browser;

    public static Browser getBrowser(String browserName, List<String> browserOptions) {
        if (browser == null) {
            WebDriver driver;

            switch (browserName) {
                case "Google Chrome":
                    browser = new Browser(browserName, browserOptions);
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments(browserOptions);
                    driver = new ChromeDriver(chromeOptions);
                    browser.setDriver(driver);
                    break;
                case "Mozilla Firefox":
                    browser = new Browser(browserName, browserOptions);
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments(browserOptions);
                    driver = new FirefoxDriver(firefoxOptions);
                    browser.setDriver(driver);
                    break;
            }
        }
        return browser;
    }
}

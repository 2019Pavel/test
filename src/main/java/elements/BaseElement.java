package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static browser.Browser.getDriver;

public class BaseElement {
    private By locator;
    private String name;

    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public By getLocator() { return locator; }

    public String getName() { return name; }

    public String getText() { return findElement().getText(); }

    public WebElement findElement() { return getDriver().findElement(locator); }

    public void click() { findElement().click(); }
}

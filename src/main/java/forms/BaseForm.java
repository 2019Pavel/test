package forms;

import org.openqa.selenium.By;

public class BaseForm {
    private By locator;
    private String name;

    public BaseForm(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }
}

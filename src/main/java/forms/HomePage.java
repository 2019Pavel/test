package forms;

import elements.Button;
import org.openqa.selenium.By;

public class HomePage extends BaseForm {
    private final Button elementsButton = new Button(By.xpath("//*[@viewBox = '0 0 448 512']"), "Elements button");

    public HomePage() { super(By.className("banner-image"), "Home page"); };

    public void clickElementsButton() { elementsButton.click(); }
}

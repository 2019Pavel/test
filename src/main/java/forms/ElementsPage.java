package forms;

import elements.Button;
import org.openqa.selenium.By;

public class ElementsPage extends BaseForm {
    private final Button checkBoxButton = new Button(By.xpath("//span[@class = 'text' and contains(text(), 'Check Box')]"), "Check Box button");

    public ElementsPage() { super(By.xpath("//div[@class = 'main-header' and contains(text(), 'Elements')]"), "Elements page"); };

    public void clickCheckBoxButton() { checkBoxButton.click(); }
}

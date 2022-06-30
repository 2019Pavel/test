package forms;

import elements.RadioButton;
import org.openqa.selenium.By;

public class RadioButtonPage extends BaseForm {
    private final RadioButton impressiveRadioButton = new RadioButton(By.xpath("//label[@for = 'impressiveRadio']"), "Impressive radio button");
    private final RadioButton yesRadioButton = new RadioButton(By.xpath("//label[@for = 'yesRadio']"), "Yes radio button");

    public RadioButtonPage() { super(By.xpath("//div[@class = 'main-header' and contains(text(), 'Radio Button')]"), "Radio Button page"); };

    public void clickImpressiveRadioButton() { impressiveRadioButton.click(); }

    public void clickYesRadioButton() { yesRadioButton.click(); }
}

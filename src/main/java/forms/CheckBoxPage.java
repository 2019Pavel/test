package forms;

import elements.Button;
import elements.CheckBox;
import org.openqa.selenium.By;

public class CheckBoxPage extends BaseForm {
    private final CheckBox homeCheckBox = new CheckBox(By.className("rct-checkbox"), "Home check box");
    private final Button radioButtonButton = new Button(By.xpath("//span[@class = 'text' and contains(text(), 'Radio Button')]"), "Radio Button button");

    public CheckBoxPage() { super(By.xpath("//div[@class = 'main-header' and contains(text(), 'Check Box')]"), "Check Box page"); };

    public void clickHomeCheckBox() { homeCheckBox.click(); }

    public void clickRadioButtonButton() { radioButtonButton.click(); }
}

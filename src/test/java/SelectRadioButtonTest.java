import BaseTest.BaseTest;
import elements.RadioButton;
import forms.CheckBoxPage;
import forms.ElementsPage;
import forms.HomePage;
import forms.RadioButtonPage;
import org.testng.annotations.Test;

public class SelectRadioButtonTest extends BaseTest {
    @Test
    public void selectRadioButton() {
        HomePage homePage = new HomePage();
        homePage.clickElementsButton();
        ElementsPage elementsPage = new ElementsPage();
        elementsPage.clickCheckBoxButton();
        CheckBoxPage checkBoxPage = new CheckBoxPage();
        checkBoxPage.clickHomeCheckBox();
        checkBoxPage.clickRadioButtonButton();
        RadioButtonPage radioButtonPage = new RadioButtonPage();
        radioButtonPage.clickImpressiveRadioButton();
        radioButtonPage.clickYesRadioButton();
    }
}

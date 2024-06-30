package tests;
import static org.testng.AssertJUnit.*;
import org.testng.annotations.Test;

public class HerokuappCheckboxesTest extends BaseTest {

    @Test(description = "Проверить, что первый чекбокс unchecked")
    public void uncheckedOneCheckbox() {
        openHerokuapp("/checkboxes");
        assertFalse(checkboxesPage.checkedOneCheckbox());
        checkboxesPage.clickOneCheckbox();
        assertTrue(checkboxesPage.checkedOneCheckbox());
    }

    @Test(description = "Проверить, что второй чекбокс checked")
    public void checkedTwoCheckbox() {
        openHerokuapp("/checkboxes");
        assertTrue(checkboxesPage.checkedTwoCheckbox());
        checkboxesPage.clickTwoCheckbox();
        assertFalse(checkboxesPage.checkedTwoCheckbox());
    }
}
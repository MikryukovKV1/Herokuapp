package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class HerokuappDynamicControlsTest extends BaseTest {

    @Test(description = "Проверка что чекбокс отсутствует на странице")
    public void checkTextAlert() {
        openHerokuapp("/dynamic_controls");
        dynamicControlsPage.waitTextItsGone();
        assertFalse(dynamicControlsPage.isDisplayedCheckbox());
    }
}
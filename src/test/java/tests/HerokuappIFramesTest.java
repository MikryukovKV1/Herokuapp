package tests;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class HerokuappIFramesTest extends BaseTest {

    @Test(description = "Проверка текста внутри параграфа")
    public void comparisonTextParagraphTest() {
        openHerokuapp("/frames");
        assertEquals(framesPage.transitionIFramesPage()
                                .getTextParagraph(), "Your content goes here.");
    }
}
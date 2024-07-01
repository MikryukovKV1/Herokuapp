package tests;

import static org.testng.AssertJUnit.*;
import org.testng.annotations.Test;

public class HerokuappTablesTest extends BaseTest {

    @Test(description = "Проверка соответствия содержания ячеек в одной таблице")
    public void checkingCellContents() {
        openHerokuapp("/tables");
        assertEquals(tablesPage.getTextCell2Tab1(), "$51.00");
        assertEquals(tablesPage.getTextCell3Tab1(), "jdoe@hotmail.com");
        assertEquals(tablesPage.getTextCell4Tab1(), "$50.00");
    }

    @Test(description = "Проверка соответствия содержания ячеек в разных таблицах")
    public void checkingCellContentsInTwoTables() {
        openHerokuapp("/tables");
        assertEquals(tablesPage.getTextCell1Tab1(), tablesPage.getTextCell1Tab2());
    }
}
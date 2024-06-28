package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappHoversProfilePage extends BasePage {

    private final By ERROR = By.xpath("//*[text()='Not Found']");

    public HerokuappHoversProfilePage(WebDriver driver) {
        super(driver);
    }

    @Step("Получение информации о наличие/отсутствии ошибки ")
    public boolean getTextError() {
        return driver.findElement(ERROR).isDisplayed();
    }
}
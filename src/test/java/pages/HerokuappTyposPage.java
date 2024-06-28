package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappTyposPage extends BasePage {

    private By TEXT_P = By.xpath("//p[contains(text(), 'Sometimes you')]");

    public HerokuappTyposPage(WebDriver driver) {
        super(driver);
    }

    @Step("Получение текста из параграфа")
    public String spellCheck() {
        return driver.findElement(TEXT_P).getText();
    }
}
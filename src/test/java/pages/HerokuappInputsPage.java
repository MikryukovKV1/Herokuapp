package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HerokuappInputsPage extends BasePage {

    private final By INPUT_NUMBER = By.xpath("//input");

    public HerokuappInputsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Заполнение поля с помощью метода Keys.ARROW_UP")
    public String sendKeysUpInput() {
        driver.findElement(INPUT_NUMBER).sendKeys(Keys.ARROW_UP);
        return driver.findElement(INPUT_NUMBER).getAttribute("value");
    }

    @Step("Заполнение поля с помощью метода Keys.ARROW_DOWN")
    public String sendKeysDownInput() {
        driver.findElement(INPUT_NUMBER).sendKeys(Keys.ARROW_DOWN);
        return driver.findElement(INPUT_NUMBER).getAttribute("value");
    }

    @Step("Заполнение поля с помощью метода sendKeys {keys}")
    public String sendKeysInput(String keys) {
        driver.findElement(INPUT_NUMBER).sendKeys(keys);
        return driver.findElement(INPUT_NUMBER).getAttribute("value");
    }
}
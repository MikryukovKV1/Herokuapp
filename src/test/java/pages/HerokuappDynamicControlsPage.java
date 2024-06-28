package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HerokuappDynamicControlsPage extends BasePage {

    private final By BUTTON_REMOVE = By.xpath("//button[@onclick='swapCheckbox()']");
    private final By CHECKBOX = By.xpath("//*[text()=' A checkbox']");
    private final By TEXT_ITS_GONE = By.xpath("//p[@id='message']");

    public HerokuappDynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Ожидание текста после клика по кнопке")
    public void waitTextItsGone() {
        driver.findElement(BUTTON_REMOVE).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(TEXT_ITS_GONE));
    }
    @Step("Наличие чекбокса на странице")
    public boolean isDisplayedCheckbox() {
        return !driver.findElements(CHECKBOX).isEmpty();
    }
}
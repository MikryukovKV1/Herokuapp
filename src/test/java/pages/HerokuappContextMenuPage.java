package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappContextMenuPage extends BasePage {

    private final By BORDER = By.xpath("//div[@id='hot-spot']");

    public HerokuappContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @Step("Получить текст из Alert-а")
    public String getTextAlert() {
        actions.moveToElement(driver.findElement(BORDER)).contextClick().build().perform();
        alert = driver.switchTo().alert();
        return alert.getText();
    }

    @Step("Закрыть Alert")
    public void closeAlert() {
        alert.dismiss();
    }
}
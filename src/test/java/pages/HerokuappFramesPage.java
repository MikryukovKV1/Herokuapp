package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappFramesPage extends BasePage{

    private final By LINK_IFRAMES = By.xpath("//a[text()='iFrame']");

    public HerokuappFramesPage(WebDriver driver) {
        super(driver);
    }

    @Step("Клик по ссылке IFrame")
    public HerokuappIFramesPage transitionIFramesPage() {
        driver.findElement(LINK_IFRAMES).click();
        return new HerokuappIFramesPage(driver);
    }
}
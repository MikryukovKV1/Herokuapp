package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappCheckboxesPage extends BasePage {

    private final By CHECKBOX_1 = By.xpath("//input[@type='checkbox'][1]");
    private final By CHECKBOX_2 = By.xpath("//input[@type='checkbox'][2]");

    public HerokuappCheckboxesPage(WebDriver driver) {
        super(driver);
    }

    @Step("Выбрать первый чекбокс")
    public void clickOneCheckbox() {
        driver.findElement(CHECKBOX_1).click();
    }

    @Step("Выбрать второй чекбокс")
    public void clickTwoCheckbox() {
        driver.findElement(CHECKBOX_2).click();
    }

    @Step("Выбран ли первый чекбокс?")
    public boolean checkedOneCheckbox() {
        return driver.findElement(CHECKBOX_1).isSelected();
    }

    @Step("Выбран ли второй чекбокс?")
    public boolean checkedTwoCheckbox() {
        return driver.findElement(CHECKBOX_2).isSelected();
    }

}
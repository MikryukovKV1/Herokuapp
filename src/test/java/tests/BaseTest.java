package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    HerokuappCheckboxesPage checkboxesPage;
    HerokuappTyposPage typosPage;
    HerokuappTablesPage tablesPage;
    HerokuappHoversPage hoversPage;
    HerokuappNotificationMessagePage notificationMessagePage;
    HerokuappContextMenuPage contextMenuPage;
    HerokuappDynamicControlsPage dynamicControlsPage;
    HerokuappInputsPage inputsPage;
    HerokuappFramesPage framesPage;
    private final static String BASE_URL_HEROKUAPP = "http://the-internet.herokuapp.com";

    @Step("Открытие браузера")
    public void openHerokuapp(String url) {
        driver.get(BASE_URL_HEROKUAPP + url);
    }

    @BeforeMethod(description = "setup")
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        checkboxesPage = new HerokuappCheckboxesPage(driver);
        typosPage = new HerokuappTyposPage(driver);
        tablesPage = new HerokuappTablesPage(driver);
        hoversPage = new HerokuappHoversPage(driver);
        notificationMessagePage = new HerokuappNotificationMessagePage(driver);
        contextMenuPage = new HerokuappContextMenuPage(driver);
        dynamicControlsPage = new HerokuappDynamicControlsPage(driver);
        inputsPage = new HerokuappInputsPage(driver);
        framesPage = new HerokuappFramesPage(driver);
    }

    @AfterMethod(alwaysRun = true, description = "Закрытие браузера")
    public void close() {
        driver.quit();
    }
}
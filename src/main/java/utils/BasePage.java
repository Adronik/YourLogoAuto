package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static utils.WebDriverConfigurator.driver;



public class BasePage extends PageFactory {

    public BasePage() {
        initElements(WebDriverConfigurator.driver, this);
    }

    public static void waitFor(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public static void waitForElement(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

}

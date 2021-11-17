package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class WebDriverConfigurator {

    public static WebDriver driver;

    public static void openBrowser() {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static void closeBrowser() {
        driver.quit();
    }

}

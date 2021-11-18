package utils;

import pages.HomePage;
import java.util.concurrent.TimeUnit;
import static utils.WebDriverConfigurator.driver;



public class Navigation {

    public static HomePage openHomePage() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        return new HomePage();
    }

}

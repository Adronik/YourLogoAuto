package utils;

import static utils.WebDriverConfigurator.driver;

public class Navigation {

    public static void openHomePage() {
        driver.get("http://automationpractice.com/index.php");
    }

}

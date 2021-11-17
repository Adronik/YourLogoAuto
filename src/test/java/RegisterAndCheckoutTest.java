import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Navigation;
import utils.WebDriverConfigurator;



public class RegisterAndCheckoutTest {

    @BeforeMethod
    public void beforeEachTest() {
        WebDriverConfigurator.openBrowser();
    }

    @Test
    public void successRegistrationAndCheckoutTest() {
        Navigation.openHomePage();
    }

    @AfterMethod
    public void afterEachTest() {
        WebDriverConfigurator.closeBrowser();
    }

}

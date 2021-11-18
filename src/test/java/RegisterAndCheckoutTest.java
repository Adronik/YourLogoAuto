import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignInPage;
import utils.Navigation;
import utils.WebDriverConfigurator;



public class RegisterAndCheckoutTest {

    @BeforeMethod
    public void beforeEachTest() {
        WebDriverConfigurator.openBrowser();
    }

    @Test
    public void successRegistrationAndCheckoutTest() {
        SignInPage signInPage = Navigation.openHomePage().clickOnSignIn();
    }

    @AfterMethod
    public void afterEachTest() {
        WebDriverConfigurator.closeBrowser();
    }

}

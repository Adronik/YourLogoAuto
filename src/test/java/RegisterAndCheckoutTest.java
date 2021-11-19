import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoggedInUserPage;
import pages.NewAccountPage;
import pages.SignInPage;
import utils.Navigation;
import utils.User;
import utils.UserList;
import utils.WebDriverConfigurator;

import java.util.Random;


public class RegisterAndCheckoutTest {

    private User newUser = new UserList().newUser;

    @BeforeMethod
    public void beforeEachTest() {
        WebDriverConfigurator.openBrowser();
    }

    @Test
    public void successRegistrationAndCheckoutTest() {
        Random generator = new Random();
        int randomInt = generator.nextInt(9999);
        String email = "username" + randomInt + "@gmail.com";

        SignInPage signInPage = Navigation.openHomePage().clickOnSignIn();
        NewAccountPage newAccountPage = signInPage.registerEmail(email);
        LoggedInUserPage loggedInUserPage = newAccountPage.registerUser(newUser);
    }

    @AfterMethod
    public void afterEachTest() {
        //WebDriverConfigurator.closeBrowser();
    }

}

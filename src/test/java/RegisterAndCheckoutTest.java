import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
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
        String confirmation_text = "ORDER CONFIRMATION";

        SignInPage signInPage = Navigation.openHomePage().clickOnSignIn();
        NewAccountPage newAccountPage = signInPage.registerEmail(email);
        LoggedInUserPage loggedInUserPage = newAccountPage.registerUser(newUser);
        loggedInUserPage.assertHeader(newUser);
        loggedInUserPage.clickTShirtsSection();
        loggedInUserPage.selectTShort();
        String shirt_name = loggedInUserPage.getItemName();
        loggedInUserPage.clickAddToCard();
        OrderPage orderPage = loggedInUserPage.clickProceedToCheckout();
        orderPage.assertDeliveryNameSurname(newUser);
        orderPage.assertDeliveryAddress(newUser);
        orderPage.assertDeliveryCity(newUser);
        orderPage.assertDeliveryMobile(newUser);
        orderPage.assertInvoiceNameSurname(newUser);
        orderPage.assertInvoiceAddress(newUser);
        orderPage.assertInvoiceCity(newUser);
        orderPage.assertInvoiceMobile(newUser);
        orderPage.clickProceed();
        orderPage.clickProceedAddress();
        orderPage.checkTermsOfService();
        orderPage.clickSubmitToPayment();
        orderPage.selectBankWirePayment();
        orderPage.clickConfirmOrder();
        orderPage.assertConfirmationText(confirmation_text);
        OrderHistoryPage orderHistoryPage = orderPage.clickBackToOrders();
    }

    @AfterMethod
    public void afterEachTest() {
        //WebDriverConfigurator.closeBrowser();
    }

}

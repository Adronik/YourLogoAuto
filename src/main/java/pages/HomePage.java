package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;


public class HomePage extends BasePage {

    @FindBy(className = "login")
    private WebElement signInButton;

    public SignInPage clickOnSignIn() {
        waitForElement(signInButton);
        signInButton.click();
        return new SignInPage();
    }

}

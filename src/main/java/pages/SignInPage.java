package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class SignInPage extends BasePage {

    @FindBy(id = "email_create")
    private WebElement emailField;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccBtn;


    public NewAccountPage registerEmail(String email) {
        waitForElement(emailField);
        emailField.sendKeys(email);
        createAccBtn.click();
        return new NewAccountPage();
    }

}

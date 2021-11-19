package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.BasePage;
import utils.User;



public class NewAccountPage extends BasePage {

    @FindBy(id = "customer_firstname")
    private WebElement customerFirstName;

    @FindBy(id = "customer_lastname")
    private WebElement customerLastName;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "id_state")
    private WebElement state;

    @FindBy(id = "postcode")
    private WebElement postcode;

    @FindBy(id = "phone_mobile")
    private WebElement mobileNum;

    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    @FindBy(id = "uniform-id_state")
    private WebElement selectStateDropdown;



    public LoggedInUserPage registerUser(User user) {
        waitForElement(registerButton);
        customerFirstName.sendKeys(user.getFirstName());
        customerLastName.sendKeys(user.getLastName());
        password.sendKeys(user.getPassword());
        address.sendKeys(user.getAddress());
        city.sendKeys(user.getCity());
        selectStateDropdown.click();
        Select select = new Select(state);
        select.selectByVisibleText(user.getState());
        postcode.sendKeys(user.getPostcode());
        mobileNum.sendKeys(user.getMobileNum());
        registerButton.click();
        return new LoggedInUserPage();
    }

}

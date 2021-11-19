package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;
import utils.User;
import static org.testng.Assert.assertEquals;

public class LoggedInUserPage extends BasePage {

    @FindBy(xpath = "//a[@title='Home']")
    private WebElement homeBtn;

    @FindBy(xpath = "//ul[starts-with(@class, 'sf-menu')]/li[3]/a")
    private WebElement tshirtsLink;

    @FindBy(xpath = "//*[@itemprop='name']/a")
    private WebElement productLink;

    @FindBy(xpath = "//*[@itemprop='name']")
    private WebElement itemName;

    @FindBy(xpath = "//button[@name='Submit']")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement proceedBtn;

    @FindBy(xpath = "//a[@class='account']/span")
    private WebElement account;



    public void assertHeader(User user) {
        waitForElement(account);
        assertEquals(user.getFirstName() + " " + user.getLastName(), account.getText());
    }

    public void selectTShort() {
        waitForElement(productLink);
        productLink.click();
    }

    public void clickTShirtsSection() {
        waitForElement(tshirtsLink);
        tshirtsLink.click();
    }

    public HomePage clickHome() {
        waitForElement(homeBtn);
        homeBtn.click();
        return new HomePage();
    }

    public String getItemName() {
        waitForElement(itemName);
        return itemName.getText();
    }

    public void clickAddToCard() {
        waitForElement(addToCartBtn);
        addToCartBtn.click();
    }

    public OrderPage clickProceedToCheckout() {
        waitForElement(proceedBtn);
        proceedBtn.click();
        return new OrderPage();
    }

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;
import utils.User;

import static org.testng.Assert.assertEquals;

public class OrderPage extends BasePage {

    @FindBy(xpath = "//ul[@class='address first_item item box']//span[@class='address_name']")
    private WebElement deliveryNameSurname;

    @FindBy(xpath = "//ul[@class='address first_item item box']//span[@class='address_address1']")
    private WebElement deliveryAddress;

    @FindBy(xpath = "//ul[@class='address first_item item box']//span[@class='address_city']")
    private WebElement deliveryCity;

    @FindBy(xpath = "//ul[@class='address first_item item box']//span[@class='address_phone_mobile']")
    private WebElement deliveryMobile;

    @FindBy(xpath = "//ul[@class='address last_item alternate_item box']//span[@class='address_name']")
    private WebElement invoiceNameSurname;

    @FindBy(xpath = "//ul[@class='address last_item alternate_item box']//span[@class='address_address1']")
    private WebElement invoiceAddress;

    @FindBy(xpath = "//ul[@class='address last_item alternate_item box']//span[@class='address_city']")
    private WebElement invoiceCity;

    @FindBy(xpath = "//ul[@class='address last_item alternate_item box']//span[@class='address_phone_mobile']")
    private WebElement invoiceMobile;

    @FindBy(xpath = "//p[@class='cart_navigation clearfix']/a[@title='Proceed to checkout']")
    private WebElement proceedCheckout;



    public String getDeliveryName() {
        waitForElement(deliveryNameSurname);
        return deliveryNameSurname.getText();
    }

    public String getDeliveryAddress() {
        waitForElement(deliveryAddress);
        return deliveryAddress.getText();
    }

    public String getDeliveryCity() {
        waitForElement(deliveryCity);
        return deliveryCity.getText();
    }

    public String getDeliveryMobile() {
        waitForElement(deliveryMobile);
        return deliveryMobile.getText();
    }

    public String getInvoiceName() {
        waitForElement(invoiceNameSurname);
        return invoiceNameSurname.getText();
    }

    public String getInvoiceAddress() {
        waitForElement(invoiceAddress);
        return invoiceAddress.getText();
    }

    public String getInvoiceCity() {
        waitForElement(invoiceCity);
        return invoiceCity.getText();
    }

    public String getInvoiceMobile() {
        waitForElement(invoiceMobile);
        return invoiceMobile.getText();
    }

    public void assertDeliveryNameSurname(User user) {
        assertEquals(user.getFirstName() + " " + user.getLastName(), getDeliveryName());
    }

    public void assertDeliveryAddress(User user) {
        assertEquals(user.getAddress(), getDeliveryAddress());
    }

    public void assertDeliveryCity(User user) {
        assertEquals(user.getCity() + ", " + user.getState() + " " + user.getPostcode(), getDeliveryCity());
    }

    public void assertDeliveryMobile(User user) {
        assertEquals(user.getMobileNum(), getDeliveryMobile());
    }

    public void assertInvoiceNameSurname(User user) {
        assertEquals(user.getFirstName() + " " + user.getLastName(), getInvoiceName());
    }

    public void assertInvoiceAddress(User user) {
        assertEquals(user.getAddress(), getInvoiceAddress());
    }

    public void assertInvoiceCity(User user) {
        assertEquals(user.getCity() + ", " + user.getState() + " " + user.getPostcode(), getInvoiceCity());
    }

    public void assertInvoiceMobile(User user) {
        assertEquals(user.getMobileNum(), getInvoiceMobile());
    }

    public void clickProceed() {
        waitForElement(proceedCheckout);
        proceedCheckout.click();
    }

}

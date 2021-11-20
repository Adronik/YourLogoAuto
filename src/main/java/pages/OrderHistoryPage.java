package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;
import static org.testng.Assert.assertEquals;



public class OrderHistoryPage extends BasePage {

    @FindBy(xpath = "//a[@class='color-myaccount']")
    private WebElement orderLink;

    @FindBy(xpath = "//*[@class='item']/*[@class='bold']/label")
    private WebElement productName;


    public void clickOrderLink() {
        waitForElement(orderLink);
        orderLink.click();
    }

    public String getProductName() {
        waitForElement(productName);
        return productName.getText().split(" -")[0];
    }

    public void assertCorrectProductInOrderHistory(String prodName) {
        assertEquals(prodName, getProductName());
    }

}

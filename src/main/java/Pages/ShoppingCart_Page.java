package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart_Page {
    WebDriver driver;

    private By product_unit_price=By.className("product-unit-price");
    private By product_subtotal=By.className("product-subtotal");
    private By remove_btn=By.className("remove-btn");
    private By update_Cart=By.id("updatecart");
    private By orderTotal=By.xpath("//tr[@class=\"order-total\"]//strong");
    private By noData=By.className("no-data");
    private By termsOfServiceCheckBox= By.id("termsofservice");
    private By qty_Input=By.className("qty-input");

    private By checkoutBtn=By.id("checkout");

    public ShoppingCart_Page(WebDriver driver) {
        this.driver = driver;
    }

    public String getProduct_unit_price() {
        return driver.findElement(product_unit_price).getText();
        }

    public String getProduct_subtotal() {
        return  (driver.findElement(this.product_subtotal).getText());
        }

    public void clickRemove_btn() {
         driver.findElement(remove_btn).click();
    }

    public void clickOnUpdateCart()
    {
        driver.findElement(this.update_Cart).click();
    }

    public String getOrderTotalPrice() {
        return driver.findElement(orderTotal).getText();
    }

    public String chkNoData() {
        return driver.findElement(noData).getText();
    }

    public void Qty_Input(String Qty) {
        driver.findElement(qty_Input).clear();
        driver.findElement(qty_Input).sendKeys(Qty);
    }

    public void TermsOfServiceCheckBox_On() {
        driver.findElement(this.termsOfServiceCheckBox).click();
    }
    public Checkout_as_a_guest_or_register_Page clickOnCheckoutBtn()
    {
        driver.findElement(this.checkoutBtn).click();
        return new Checkout_as_a_guest_or_register_Page(driver);
    }
}

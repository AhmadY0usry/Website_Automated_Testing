package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserDataCheckout_Page extends Page_Base {
    WebDriver driver;

    public UserDataCheckout_Page(WebDriver driver) {
        this.driver = driver;
    }

    private By FirstName=By.id("BillingNewAddress_FirstName");
    private By LastName=By.id("BillingNewAddress_LastName");
    private By Email= By.id("BillingNewAddress_Email");
    private By CountryId= By.id("BillingNewAddress_CountryId");
    private By City= By.id("BillingNewAddress_City");
    private By Address1= By.id("BillingNewAddress_Address1");
    private By ZipPostalCode= By.id("BillingNewAddress_ZipPostalCode");
    private By PhoneNumber= By.id("BillingNewAddress_PhoneNumber");
    private By billingContinueBtn =By.xpath("//div[@id=\"billing-buttons-container\"]//button[@name=\"save\"]");
    private By shippingMethodContinueBtn =By.cssSelector(".button-1.shipping-method-next-step-button");
    private By paymentMethodContinueBtn =By.cssSelector(".button-1.payment-method-next-step-button");
    private By paymentInfoContinueBtn =By.cssSelector(".button-1.payment-info-next-step-button");
    private By BillingAddressName=By.xpath("//div[@class=\"billing-info\"]//ul[@class='info-list']//li[@class='name']");
    private By BillingAddressEmail=By.xpath("//div[@class=\"billing-info\"]//ul[@class='info-list']//li[@class='email']");
    private By ConfirmBtn= By.cssSelector(".button-1.confirm-order-next-step-button");
    private By orderSuccessMsg=By.cssSelector("div.section.order-completed > div.title > strong");

    public void FillMandatoryField(String Fname,String Lname,String email,String Country, String City, String Address, String ZipCode,String phone)
    {
        driver.findElement(this.FirstName).clear();
        driver.findElement(this.FirstName).sendKeys(Fname);
        driver.findElement(this.LastName).clear();
        driver.findElement(this.LastName).sendKeys(Lname);
        driver.findElement(this.Email).clear();
        driver.findElement(this.Email).sendKeys(email);
        selectByText((driver.findElement(CountryId)),Country);
        driver.findElement(this.City).sendKeys(City);
        driver.findElement(this.Address1).sendKeys(Address);
        driver.findElement(this.ZipPostalCode).sendKeys(ZipCode);
        driver.findElement(this.PhoneNumber).sendKeys(phone);
    }
    public void ClickOnBillingContinueBtn(){
        driver.findElement(this.billingContinueBtn).click();
    }
    public void ClickOnShippingMethodContinueBtn(){
        driver.findElement(this.shippingMethodContinueBtn).click();
    }
    public void ClickOnPaymentMethodContinueBtn(){
        driver.findElement(this.paymentMethodContinueBtn).click();
    }
    public void ClickOnPaymentInfoContinueBtn(){
        driver.findElement(this.paymentInfoContinueBtn).click();
    }
    public void ClickOnConfirmBtn()
    {
        driver.findElement(this.ConfirmBtn).click();
    }

    public String getBillingAddressName()
    {
        return driver.findElement(this.BillingAddressName).getText();
    }
    public String getBillingAddressEmail()
    {
        return driver.findElement(this.BillingAddressEmail).getText();
    }

    public String getSuccessMsg()
    {
        return   driver.findElement(this.orderSuccessMsg).getText();
    }

}

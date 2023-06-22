package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout_as_a_guest_or_register_Page {

    public WebDriver driver;

    public Checkout_as_a_guest_or_register_Page(WebDriver driver) {
        this.driver = driver;
    }

    private By Email=By.id("Email");
    private By Password=By.id("Password");
    private By login_Btn=By.cssSelector(".button-1.login-button");


    public void enterEmail_Pass(String email, String password)
    {
        driver.findElement(this.Email).sendKeys(email);
        driver.findElement(this.Password).sendKeys(password);
    }
    public void clickOnLoginBtn()
    {
        driver.findElement(this.login_Btn).click();
    }
}

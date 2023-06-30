package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class Register_Page {
    private WebDriver driver;

    public Register_Page(WebDriver driver) {
        this.driver = driver;
    }

    private By select_male = By.id("gender-male");
    private By firstName = By.id("FirstName");
    private By lastName = By.id("LastName");
    private By Email = By.id("Email");
    private By Password = By.id("Password");
    private By ConfirmPassword = By.id("ConfirmPassword");
    private By register_button = By.id("register-button");
    private By Success_MSG = By.className("result");
    private By Login = By.linkText("Log in");

    public void fill_Register_Form(String firstname, String lastName, String email, String pass) {
        driver.findElement(this.select_male).click();
        driver.findElement(firstName).sendKeys(firstname);
        driver.findElement(this.lastName).sendKeys(lastName);
        driver.findElement(this.Email).sendKeys(email);
        driver.findElement(this.Password).sendKeys(pass);
        driver.findElement(this.ConfirmPassword).sendKeys(pass);
    }

    public void clickOnRegisterButton() {
        driver.findElement(this.register_button).click();
    }

    public String chk_Success_Msg() {
        return driver.findElement(this.Success_MSG).getText();
    }

    public Login_Page Click_On_Login_from_Bar()

    {
        driver.findElement(this.Login).click();
        return new Login_Page(driver);
    }
}

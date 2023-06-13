package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class My_Account {
    WebDriver driver;
    public My_Account(WebDriver driver)
    {
        this.driver=driver;
    }
private By Change_password_link = By.linkText("Change password");
    private By old_Password_field= By.id("OldPassword");
    private By new_Password_field= By.id("NewPassword");
    private By confirm_Password_field= By.id("ConfirmNewPassword");
    private  By Change_Password_Button=By.cssSelector("button.button-1.change-password-button");
    private By operation_success_bar=By.className("content");


    public void Click_On_ChangePassword()
    {
        driver.findElement(this.Change_password_link).click();
    }
    public void Enter_New_Password(String oldPass, String newPass)
    {
        driver.findElement(this.old_Password_field).sendKeys(oldPass);
        driver.findElement(this.new_Password_field).sendKeys(newPass);
        driver.findElement(this.confirm_Password_field).sendKeys(newPass);
    }

    public WebElement Check_Visible_of_success_opr()
    {
        WebElement op_success_bar= driver.findElement(this.operation_success_bar);
        return op_success_bar;
    }

    public void Click_On_ChangPasBtn_confirmation()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.Change_Password_Button));
        driver.findElement(Change_Password_Button).click();
    }

}

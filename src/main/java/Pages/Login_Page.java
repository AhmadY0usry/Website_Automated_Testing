package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
private WebDriver driver;
private By Email_Field=By.id("Email");
private By Password =By.id("Password");
private By Login_Button=By.cssSelector("button[type='submit']:nth-child(1)");
private WebElement Log;
public WebElement checkUserStatus ()
{
    Log= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
    return Log;
}
public Login_Page(WebDriver driver) {
        this.driver = driver;
    }
    public void fill_Email_Pass_Field(String email,String pass)
    {
        driver.findElement(this.Email_Field).sendKeys(email);
        driver.findElement(this.Password).sendKeys(pass);
    }
public void Click_On_Login_Button()
{
    driver.findElement(this.Login_Button).click();
}


}

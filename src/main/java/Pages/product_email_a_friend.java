package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class product_email_a_friend {
    WebDriver driver;

    public product_email_a_friend(WebDriver driver) {
        this.driver = driver;
    }
    private By FriendEmail=By.id("FriendEmail");
    private By YourEmailAddress=By.id("YourEmailAddress");
    private By PersonalMessage=By.id("PersonalMessage");
    private By send_email=By.name("send-email");
    private By product=By.className("product");
    private By message_been_sent=By.className("result");


    public String chkTheProduct()
    {
        return driver.findElement(this.product).getText();
    }
    public void Enter_FriendEmail_YourEmail_PersonalMsg(String FriendEmail,String YourEmail,String Msg)
    {
        driver.findElement(this.FriendEmail).sendKeys(FriendEmail);
        driver.findElement(this.YourEmailAddress).clear();
        driver.findElement(this.YourEmailAddress).sendKeys(YourEmail);
        driver.findElement(this.PersonalMessage).sendKeys(Msg);
    }
    public void clickOnSendEmail()
    {
        driver.findElement(this.send_email).click();
    }

    public boolean Chk_Your_message_has_been_sent()
    {
        return driver.findElement(this.message_been_sent).getText().contains("Your message has been sent");
    }

}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact_Us_Page {
    WebDriver driver;

    public Contact_Us_Page(WebDriver driver) {
        this.driver = driver;
    }
    private By FullName =By.id("FullName");
    private By Email =By.id("Email");
    private By Enquiry =By.id("Enquiry");
    private By send_email =By.name("send-email");
    private By successEnquiry =By.className("result");
    public void Enter_YourName_Email (String FName,String Email)
    {
        driver.findElement(this.FullName).sendKeys(FName);
        driver.findElement(this.Email).sendKeys(Email);
    }

    public void Write_Your_Enquiry(String enquiry)
    {
        driver.findElement(this.Enquiry).sendKeys(enquiry);
    }
    public void Click_Submit()
    {
        driver.findElement(this.send_email).click();
    }
    public String chkSuccessEnquiryMsg()
    {
      return driver.findElement(successEnquiry).getText();
    }
}

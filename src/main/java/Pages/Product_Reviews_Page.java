package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product_Reviews_Page {
    WebDriver driver;

    public Product_Reviews_Page(WebDriver driver) {
        this.driver = driver;
    }
    private By AddProductReview_Title= By.id("AddProductReview_Title");
    private By AddProductReview_ReviewText= By.id("AddProductReview_ReviewText");
    private By submitBtn= By.name("add-review");
    public void Add_ReviewTitleAndText(String Rev_title, String Rev_text)
    {
        driver.findElement(this.AddProductReview_Title).sendKeys(Rev_title);
        driver.findElement(this.AddProductReview_ReviewText).sendKeys(Rev_text);
    }
    public void productRate(int rateNum)
    {
        driver.findElement(By.id("addproductrating_"+rateNum)).click();
    }
    public void ClickOnSubmitReview()
    {
        driver.findElement(submitBtn).click();
    }


}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search_Item_Page {
private WebDriver driver;

    public Search_Item_Page(WebDriver driver) {
        this.driver = driver;
                                                }

    private By itemName= By.className("product-name");
    private By email_Friend_Btn= By.cssSelector(".button-2.email-a-friend-button");

    private By AddYourReviewBtn= By.linkText("Add your review");


public boolean checkItemName (String ItemName)
{
    return driver.findElement(this.itemName).getText().equalsIgnoreCase(ItemName);
}

public product_email_a_friend clickOnEmailAFriend()
{
    driver.findElement(this.email_Friend_Btn).click();
    return new product_email_a_friend(driver);
}

public Product_Reviews_Page clickOnAddYourReview_Btn()
{
    driver.findElement(this.AddYourReviewBtn).click();
    return new Product_Reviews_Page (driver);
}

private By noOfProductReview= By.xpath("//div[@class='product-review-links']/a[1]");
public String No_OF_product_review()
{
    return driver.findElement(noOfProductReview).getText();
}


}

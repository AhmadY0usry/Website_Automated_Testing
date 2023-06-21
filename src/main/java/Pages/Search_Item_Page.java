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
    private By add_to_wishlist_button=By.id("add-to-wishlist-button-4");
    private By AddYourReviewBtn= By.linkText("Add your review");
    private By AddToCompareList = By.cssSelector(".button-2.add-to-compare-list-button");
    private By product_Comparison= By.partialLinkText("product comparison");
    private By Add_to_cart_button= By.cssSelector(".button-1.add-to-cart-button");
    private By ShoppingCartBtn=By.className("ico-cart");

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

public void clickOnAddWishlistBtn()
{
    driver.findElement(this.add_to_wishlist_button).click();
}

private By noOfProductReview= By.xpath("//div[@class='product-review-links']/a[1]");
public String No_OF_product_review()
{
    return driver.findElement(noOfProductReview).getText();
}

public void clickOnAddToCompare()
{
    driver.findElement(AddToCompareList).click();
}

public Product_Compare_Page clickOnProductComparison()
{
    driver.findElement(this.product_Comparison).click();
    return new Product_Compare_Page(driver);
}

public void clickOnAddToCart()
{
    driver.findElement(this.Add_to_cart_button).click();
}

public ShoppingCart_Page clickOnShoppingCart()
{
    driver.findElement(this.ShoppingCartBtn).click();
    return new ShoppingCart_Page(driver);
}



}

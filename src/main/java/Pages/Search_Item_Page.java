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


public boolean checkItemName (String ItemName)
{
    return driver.findElement(this.itemName).getText().equalsIgnoreCase(ItemName);
}

public product_email_a_friend clickOnEmailAFriend()
{
    driver.findElement(this.email_Friend_Btn).click();
    return new product_email_a_friend(driver);
}


}

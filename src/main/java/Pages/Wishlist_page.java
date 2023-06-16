package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Wishlist_page {
    WebDriver driver;
    List<WebElement> productList;
    private By sku_number= By.className("sku-number");

    public Wishlist_page(WebDriver driver) {
        this.driver = driver;
    }

    public String chkSku_numProductNoInList(int index)
    {
        productList=driver.findElements(sku_number);
        return productList.get(index).getText();
    }

}

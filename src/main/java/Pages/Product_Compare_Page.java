package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Product_Compare_Page {
    WebDriver driver;

    public Product_Compare_Page(WebDriver driver) {
        this.driver = driver;
    }

    private By Table_Name = By.xpath("//tr[@class='product-name']//td");
    private List<WebElement> list;

    public String checkNameCompare(int index)
    {
        list=driver.findElements(this.Table_Name);
        return list.get(index).getText();
    }
}
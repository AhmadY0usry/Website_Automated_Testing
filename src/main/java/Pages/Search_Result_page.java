package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search_Result_page {

    private WebDriver driver;

    public Search_Result_page(WebDriver driver) {
        this.driver = driver;
    }

    private By searchItem = By.className("product-title");

    public String chkResultItem ()
    {
        return driver.findElement(this.searchItem).getText();
    }

    public void chkClickableItem()
    {
        driver.findElement(By.partialLinkText(chkResultItem())).click();
    }


}

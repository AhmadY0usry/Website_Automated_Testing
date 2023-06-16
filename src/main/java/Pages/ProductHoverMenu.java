package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductHoverMenu {
    private WebDriver driver;

    public ProductHoverMenu(WebDriver driver) {
        this.driver = driver;
    }

    private By page_Title=By.className("page-title");

    public String  getHoveredPageTitle()
    {
        return driver.findElement(this.page_Title).getText();
    }

}

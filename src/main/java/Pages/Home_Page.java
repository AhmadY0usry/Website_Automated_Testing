package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
public class Home_Page {

    private WebDriver driver;

    public Home_Page(WebDriver driver) {
        this.driver = driver;
    }

    private By register_button = By.className("ico-register");

    public Register_Page clickOnRegister() {
        driver.findElement(register_button).click();
        return new Register_Page(driver);
    }
    private By loginElement = By.linkText("Log in");

    public Login_Page clickOnLogin()
    {
        driver.findElement(loginElement).click();
        return new Login_Page(driver);
    }
    private By myAccount_Button= By.className("ico-account");

    public My_Account click_On_Myaccount ()
    {
        driver.findElement(myAccount_Button).click();
        return new My_Account(driver);
    }

    public boolean check_MyAccount_visibility()
    {
        return driver.findElement(myAccount_Button).isDisplayed();
    }
    private By searchBtn=By.cssSelector("button.button-1.search-box-button");
    private By suggestion=By.className("ui-menu-item");
    private By searchBar=By.id("small-searchterms");
    private List<WebElement> optionSuggests;


    public void searchForItem (String items)
    {
        driver.findElement(this.searchBar).sendKeys(items);
    }
    public Search_Item_Page selectFromSuggestion(int index)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        optionSuggests =driver.findElements(this.suggestion);
        optionSuggests.get(index).click();
        return new Search_Item_Page(driver);
    }
    public Search_Result_page clickOnSearchBar()
    {
        driver.findElement(this.searchBtn).click();
        return new Search_Result_page(driver);
    }

    private By Contact_us =By.linkText("Contact us");
    public Contact_Us_Page ClickOnContactUs()
    {
        driver.findElement(this.Contact_us).click();
        return new Contact_Us_Page(driver);
    }
    private By customerCurrency= By.id("customerCurrency");
    private Select select;
    private By price = By.cssSelector(".price.actual-price");
    public void changeCurrency(String Currency)
    {
        select = new Select(driver.findElement(customerCurrency));
        select.selectByVisibleText(Currency);
    }
    public String chkCuurencyChange()
    {
        optionSuggests = driver.findElements(price);
        return optionSuggests.get(0).getText();
    }
    private Actions actions;
    private By Computers =By.linkText("Computers");
    private By Notebooks  =By.partialLinkText("Notebooks");
    WebDriverWait wait ;
    public ProductHoverMenu HoverOn()
    {
        actions=new Actions(driver);
        actions.moveToElement(driver.findElement(Computers)).build().perform();
        actions.moveToElement(driver.findElement(Notebooks)).click().build().perform();
        return new ProductHoverMenu(driver);
    }

    private By icon_wishlist=By.className("ico-wishlist");
    public Wishlist_page clickOnWishlist()
    {
        driver.findElement(icon_wishlist).click();
        return new Wishlist_page(driver);
    }

}
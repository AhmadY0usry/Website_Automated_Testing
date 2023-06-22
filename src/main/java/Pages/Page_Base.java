package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page_Base {
    private Select select;
    public void selectByText (WebElement element,String text)
    {
        select=new Select(element);
        select.selectByVisibleText(text);
    }
}

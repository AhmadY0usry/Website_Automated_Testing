import Pages.Search_Item_Page;
import org.testng.annotations.Test;

public class Test_AddToCart  extends Test_Base{
    Search_Item_Page searchItemPage;
    @Test
    public void AddToCart()
    {
        homePage.searchForItem("mac");
        searchItemPage=homePage.selectFromSuggestion(0);
        searchItemPage.

    }


}

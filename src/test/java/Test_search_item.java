import Pages.Search_Item_Page;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Test_search_item extends Test_Base{
    Search_Item_Page searchItemPage;
    @Test (groups = "searchItem")
    public void test()
    {
        //setUp("Edge");
        SoftAssert softAssert=new SoftAssert();
        homePage.searchForItem("Book");
        searchItemPage =homePage.selectFromSuggestion(0);
        softAssert.assertTrue(searchItemPage.checkItemName("Apple MacBook Pro 13-inch"));
        softAssert.assertAll();

    }

}

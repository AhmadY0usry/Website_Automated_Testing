import Pages.Search_Result_page;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_search_result extends Test_Base
{
Search_Result_page searchResultPage;
SoftAssert softAssert;
@Test (groups = "searchResult")
    public void testSearchResult()
    {
        softAssert=new SoftAssert();
        goHome();
        homePage.searchForItem("MacBook");
        searchResultPage=homePage.clickOnSearchBar();
        softAssert.assertTrue(searchResultPage.chkResultItem().contains("Apple MacBook Pro 13-inch"));
        searchResultPage.chkClickableItem();
        softAssert.assertAll();
    }
}

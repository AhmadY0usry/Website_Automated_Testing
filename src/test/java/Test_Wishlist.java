import Pages.Search_Item_Page;
import Pages.Wishlist_page;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Test_Wishlist extends Test_Base {
    Search_Item_Page searchItemPage;
    Wishlist_page wishlistPage;
    @Test
    public void testWishlist()
    {
        homePage.searchForItem("Mac");
        searchItemPage=homePage.selectFromSuggestion(0);
        searchItemPage.clickOnAddWishlistBtn();
        goHome();
        wishlistPage=homePage.clickOnWishlist();
        assertTrue(wishlistPage.chkSku_numProductNoInList(0).contains("AP_MBP_13"));
    }

}

import Pages.Product_Reviews_Page;
import Pages.Search_Item_Page;
import org.testng.annotations.Test;
import static org.testng.Assert.assertNotEquals;

public class Test_Product_Review extends Test_Base{
    Search_Item_Page searchItemPage;
    Product_Reviews_Page productReviewsPage;
    @Test
    public void TestReviewProductsFunctionality()
    {
        loginMethod();
        goHome();
        homePage.searchForItem("mac");
        searchItemPage=homePage.selectFromSuggestion(0);
        scrollDown();
        String NoOfReviewsBefore=searchItemPage.No_OF_product_review();
        productReviewsPage=searchItemPage.clickOnAddYourReview_Btn();
        productReviewsPage.Add_ReviewTitleAndText("Awesome Device","I recommend it deserves");
            //rate the product from 1 to 5
        productReviewsPage.productRate(4);
        productReviewsPage.ClickOnSubmitReview();
        goHome();
        homePage.searchForItem("mac");
        searchItemPage=homePage.selectFromSuggestion(0);
        scrollDown();
        String NoOfReviewsAfter=searchItemPage.No_OF_product_review();
        //check that the review were added
        assertNotEquals(NoOfReviewsAfter,NoOfReviewsBefore,"the Review Did not Submitted");
    }
}

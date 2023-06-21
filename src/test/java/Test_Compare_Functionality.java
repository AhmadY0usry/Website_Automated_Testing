import Pages.Product_Compare_Page;
import Pages.Search_Item_Page;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Test_Compare_Functionality extends Test_Base {

    Search_Item_Page searchItemPage;
    Product_Compare_Page productComparePage;
    String first_product;
    String second_product;

    @Test
    public void selectFirstProductToCompare() {
        homePage.searchForItem("mac");
        searchItemPage = homePage.selectFromSuggestion(0);
        searchItemPage.clickOnAddToCompare();
    }

    @Test (priority = 1)
    public void selectSecondProductToCompare() {

            homePage.searchForItem("asus");
            searchItemPage = homePage.selectFromSuggestion(0);
            searchItemPage.clickOnAddToCompare();


    }
    public Search_Item_Page returnSearchItemPage() {
            return searchItemPage;
        }
    @Test (dependsOnMethods = {"selectFirstProductToCompare","selectSecondProductToCompare"})
    public void chkCompareList()
    {
        searchItemPage= returnSearchItemPage();
        productComparePage=searchItemPage.clickOnProductComparison();
        first_product = productComparePage.checkNameCompare(1);
        second_product = productComparePage.checkNameCompare(2);
        assertTrue(first_product.contains("Asus N551JK-XO076H Laptop"));
        assertTrue(second_product.contains("Apple MacBook Pro 13-inch"));
    }
    public Product_Compare_Page returnProductComparePage()
    {
        return productComparePage;
    }
    @Test (dependsOnMethods = "chkCompareList")
    public void TestRemoveFunctionality()
    {
        boolean IsListClear;
        productComparePage = returnProductComparePage();
        productComparePage.clear_List();
        IsListClear=productComparePage.chkClearListFunctionality("You have no items to compare");
        assertTrue(IsListClear);
    }
}

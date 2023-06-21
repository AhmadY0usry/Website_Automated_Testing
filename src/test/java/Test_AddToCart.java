import Pages.Search_Item_Page;
import Pages.ShoppingCart_Page;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class Test_AddToCart  extends Test_Base{
    Search_Item_Page searchItemPage;
    String priceBeforeEditingQty;
    String priceAfterEditingQty;
    String firstProductPrice;
    String totalPrice;
    ShoppingCart_Page shoppingCartPage;
    @Test
    public void AddToCart()
    {
        homePage.searchForItem("mac");
        searchItemPage=homePage.selectFromSuggestion(0);
        searchItemPage.clickOnAddToCart();

        shoppingCartPage=searchItemPage.clickOnShoppingCart();
        priceBeforeEditingQty =shoppingCartPage.getOrderTotalPrice();

        shoppingCartPage.Qty_Input("4");
        shoppingCartPage.clickOnUpdateCart();

        priceAfterEditingQty=shoppingCartPage.getOrderTotalPrice();
        firstProductPrice=shoppingCartPage.getProduct_unit_price();
        totalPrice=shoppingCartPage.getProduct_subtotal();
        assertNotEquals(priceBeforeEditingQty, priceAfterEditingQty);
        assertTrue(totalPrice.contains(priceAfterEditingQty));

        shoppingCartPage.clickRemove_btn();
        assertTrue(shoppingCartPage.chkNoData().contains("Your Shopping Cart is empty!"));

    }


}

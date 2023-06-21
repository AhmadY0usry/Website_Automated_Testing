import Pages.Checkout_as_a_guest_or_register_Page;
import Pages.Register_Page;
import Pages.Search_Item_Page;
import Pages.ShoppingCart_Page;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_ProductCheckoutAsRegisteredUser extends Test_Base{
    Register_Page registerPage;
    Search_Item_Page searchItemPage;
    ShoppingCart_Page shoppingCartPage;
    Checkout_as_a_guest_or_register_Page checkoutAsAGuestOrRegisterPage;
    String Email="ahmad@gmail.com";
    String password="123456";
    @Test
    public void TestProductCheckoutAsRegisteredUser()
    {
        registerPage = homePage.clickOnRegister();
        registerPage.fill_Register_Form("Ahmad", "Yosry", this.Email,this.password);
        registerPage.clickOnRegisterButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(registerPage.chk_Success_Msg().contains("completed"));
        goHome();
        homePage.searchForItem("asus");
        searchItemPage=homePage.selectFromSuggestion(0);
        searchItemPage.clickOnAddToCart();
        shoppingCartPage=searchItemPage.clickOnShoppingCart();
        shoppingCartPage.TermsOfServiceCheckBox_On();
        checkoutAsAGuestOrRegisterPage=shoppingCartPage.clickOnCheckoutBtn();
        checkoutAsAGuestOrRegisterPage.enterEmail_Pass(this.Email,this.password);
        checkoutAsAGuestOrRegisterPage.clickOnLoginBtn();
        shoppingCartPage.TermsOfServiceCheckBox_On();
        checkoutAsAGuestOrRegisterPage=shoppingCartPage.clickOnCheckoutBtn();

    }
}

import Pages.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertTrue;

public class Test_ProductCheckoutAsRegisteredUser extends Test_Base{
    Register_Page registerPage;
    Search_Item_Page searchItemPage;
    ShoppingCart_Page shoppingCartPage;
    Checkout_as_a_guest_or_register_Page checkoutAsAGuestOrRegisterPage;
    UserDataCheckout_Page userDataCheckoutPage;
    String FirstName="Ahmad";
    String LastName="Yousry";
    String Email="ahmad70@gmail.com";
    String password="123456";
    @Test
    public void TestProductCheckoutAsRegisteredUser()
    {
//        registerPage = homePage.clickOnRegister();
//        registerPage.fill_Register_Form(FirstName, LastName, this.Email,this.password);
//        registerPage.clickOnRegisterButton();
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertTrue(registerPage.chk_Success_Msg().contains("completed"));
//        goHome();
        homePage.searchForItem("asus");
        searchItemPage=homePage.selectFromSuggestion(0);
        searchItemPage.clickOnAddToCart();
        shoppingCartPage=searchItemPage.clickOnShoppingCart();
        shoppingCartPage.TermsOfServiceCheckBox_On();
        checkoutAsAGuestOrRegisterPage=shoppingCartPage.clickOnCheckoutBtn();
        checkoutAsAGuestOrRegisterPage.enterEmail_Pass(this.Email,this.password);
        checkoutAsAGuestOrRegisterPage.clickOnLoginBtn();
        shoppingCartPage.TermsOfServiceCheckBox_On();
        shoppingCartPage.clickOnCheckoutBtn();
        userDataCheckoutPage=new UserDataCheckout_Page(checkoutAsAGuestOrRegisterPage.driver);
        userDataCheckoutPage.FillMandatoryField(this.FirstName,LastName,Email,"Egypt","Aswan","3zba","12345","01121046041");
        userDataCheckoutPage.ClickOnBillingContinueBtn();
        userDataCheckoutPage.ClickOnShippingMethodContinueBtn();
        userDataCheckoutPage.ClickOnPaymentMethodContinueBtn();
        userDataCheckoutPage.ClickOnPaymentInfoContinueBtn();
        assertTrue(userDataCheckoutPage.getBillingAddressName().contains(FirstName));
        assertTrue(userDataCheckoutPage.getBillingAddressEmail().contains(Email));
        userDataCheckoutPage.ClickOnConfirmBtn();
        assertTrue(userDataCheckoutPage.getSuccessMsg().contains("Your order has been successfully processed!"));
    }
}

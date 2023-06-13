import Pages.Login_Page;
import Pages.Search_Item_Page;
import Pages.product_email_a_friend;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Test_Send_Friend extends Test_Base{

Search_Item_Page searchItemPage;
product_email_a_friend sendFriendPage;
Login_Page loginPage;

    @Test//(groups ="sendFriendFunctionality" ,dependsOnGroups = "register")
    public void TestSendFriend()
    {       //login with Email
        loginPage=homePage.clickOnLogin();
        loginPage.fill_Email_Pass_Field("ahmad11@gmail.com","123456");
        loginPage.Click_On_Login_Button();
            //search for the product
        goHome();
        homePage.searchForItem("Mac");
        searchItemPage =homePage.selectFromSuggestion(0);
        assertTrue(searchItemPage.checkItemName("Apple MacBook Pro 13-inch"));
            //Email To Friend
        sendFriendPage =searchItemPage.clickOnEmailAFriend();
        sendFriendPage.chkTheProduct().contains("Apple MacBook Pro 13-inch");
        sendFriendPage.Enter_FriendEmail_YourEmail_PersonalMsg("Mostafa@gmail.com",
                                                                "ahmad11@gmail.com",
                                                                "Check This product It will fits You");
        sendFriendPage.clickOnSendEmail();
        assertTrue(sendFriendPage.Chk_Your_message_has_been_sent());
    }

}

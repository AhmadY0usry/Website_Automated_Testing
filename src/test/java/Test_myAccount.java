import Pages.Login_Page;
import Pages.My_Account;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertTrue;

public class Test_myAccount extends Test_Base {

    My_Account myAccount;
    Login_Page loginPage;
    @Test (groups = "MyAccount" ,dependsOnGroups = {"login", "register"})
    public void Test_Account()
    {
        setUp("edge");
        goHome();
        loginPage=homePage.clickOnLogin();
        loginPage.fill_Email_Pass_Field("ahmad11@yahoo.com","123456");
        loginPage.Click_On_Login_Button();
        assertTrue(loginPage.checkUserStatus().getText().equalsIgnoreCase("Log out"));
        goHome();
        myAccount=homePage.click_On_Myaccount();
        myAccount.Click_On_ChangePassword();
        myAccount.Enter_New_Password("123456","2318147");
        myAccount.Click_On_ChangPasBtn_confirmation();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(myAccount.Check_Visible_of_success_opr().isDisplayed());

    }
}

import Pages.Login_Page;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Test_LoginPage extends Test_Base{
    public Login_Page loginPage;
    @Test// (groups = "login", dependsOnGroups = "register")
    public void Test()
    {
        //setUp("edge");
        goHome();
        loginPage=homePage.clickOnLogin();
        loginPage.fill_Email_Pass_Field("ahmad11@gmail.com","123456");
        loginPage.Click_On_Login_Button();
        assertTrue(loginPage.checkUserStatus().getText().equalsIgnoreCase("Log out"));
    }
}

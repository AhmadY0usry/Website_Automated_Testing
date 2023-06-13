import Pages.Home_Page;
import Pages.Register_Page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class Test_Registeration extends Test_Base {
    @Test (groups = "register")
    public void testRegister() throws IOException {
        //setUp("edge");
        Register_Page registerPage;
        registerPage = homePage.clickOnRegister();
        registerPage.fill_Register_Form("Ahmad", "Yosry", "ahmad11@gmail.com", "123456");
        registerPage.clickOnRegisterButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(registerPage.chk_Success_Msg().contains("completed"));
    }
}

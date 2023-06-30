import Pages.Register_Page;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.IOException;

public class Test_Registeration extends Test_Base {
    Register_Page registerPage;

    @DataProvider(name = "TTD")
    public Object [][] TDD()
    {
        return new Object [][] {{"Fname", "Lname","Email","pass"},
                                {"Ahmad","Yosry","ahmad11@gmail.com","123456"}};
    }
    @Test (groups = "register",dataProvider = "TTD")
    public void testRegister(String Fname,String Lname,String Email, String password) throws IOException {
        //setUp("edge");
        registerPage = homePage.clickOnRegister();
        registerPage.fill_Register_Form(Fname, Lname, Email, password);
        registerPage.clickOnRegisterButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(registerPage.chk_Success_Msg().contains("completed"));

    }
}

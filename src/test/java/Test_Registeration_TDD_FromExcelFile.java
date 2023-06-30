import Pages.Register_Page;
import Test_Data.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.IOException;
public class Test_Registeration_TDD_FromExcelFile extends Test_Base  {
    Register_Page registerPage;
    @DataProvider(name = "testRegisterData")
    public Object [][] userRegisterData() throws IOException {
        ExcelReader ER = new ExcelReader();
            return  ER.getDataFromExcelFile();
        }

        @Test (dataProvider = "testRegisterData")
        public void testRegisterData(String FName, String LName, String Email, String password) {
            registerPage = homePage.clickOnRegister();
            registerPage.fill_Register_Form(FName, LName, Email, password);
            registerPage.clickOnRegisterButton();
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(registerPage.chk_Success_Msg().contains("completed"));
            softAssert.assertAll();
        }
}

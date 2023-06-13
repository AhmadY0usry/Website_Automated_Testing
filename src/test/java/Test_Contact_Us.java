import Pages.Contact_Us_Page;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class Test_Contact_Us extends Test_Base{
    Contact_Us_Page contactUsPage;
    @Test
    public void TestContactUs()
    {
        scrollDown();
        contactUsPage = homePage.ClickOnContactUs();
        contactUsPage.Enter_YourName_Email("Ahmad","ahmad11@gmail.com");
        contactUsPage.Write_Your_Enquiry("You Need To Fix some Bugs");
        contactUsPage.Click_Submit();
        assertTrue(contactUsPage.chkSuccessEnquiryMsg().contains("Your enquiry has been successfully sent to the store owner"));
    }
}

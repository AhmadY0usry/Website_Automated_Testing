import Pages.Home_Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;

public class Test_Base {
    private WebDriver driver;
    protected Home_Page homePage;
    private JavascriptExecutor jse;

    @BeforeClass
    @Parameters({"browser"})
    public void setUp(@Optional("edge") String BName) {
        if (BName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (BName.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
            homePage = new Home_Page(driver);
            maximize();
            goHome();
        }
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void goHome() {
        driver.get("https://demo.nopcommerce.com/");
    }

    public void tearDown() {
        driver.quit();
    }

    public void take_screen_shoot(String name) throws IOException {
        {
                File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileHandler.copy(file, new File("D:\\TestAutomatiom University\\ShoopingWebSite\\target\\screenshots\\" + name + ".png"));}
        }
    public void scrollDown()
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
    }

    @AfterMethod
    public void finish (ITestResult result) throws IOException {
        if(result.getStatus()==ITestResult.FAILURE)
        take_screen_shoot("Error");
    }
}


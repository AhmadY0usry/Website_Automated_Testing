import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Test_Currency_Change extends Test_Base{
    @Test
    public void testCurrencyChangeFunctionality()
    {
        String PriceBefore=homePage.chkCuurencyChange();//check price before changing currency
        homePage.changeCurrency("Euro");
        String PriceAfter=homePage.chkCuurencyChange();//check price before changing currency
        assertNotEquals(PriceBefore,PriceAfter,"The currency did not change");
    }
}

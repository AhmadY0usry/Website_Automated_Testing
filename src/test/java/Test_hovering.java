import Pages.ProductHoverMenu;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Test_hovering extends Test_Base{
    ProductHoverMenu productHoverMenu;
    @Test
    public void testHover()
    {
        this.productHoverMenu=homePage.HoverOn();
        assertTrue(productHoverMenu.getHoveredPageTitle().contains("Notebooks"));
    }

}

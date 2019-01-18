package SeleniumCheckOutPage;

import SeleniumCheckOut.ItemCheckOut;
import SeleniumCheckOut.ItemInCart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestItemCheckOut extends ItemCheckOut {
    ItemInCart itemInCart;
    ItemCheckOut itemCheckOut;
    @BeforeMethod
    public void initElement() {
        itemInCart = PageFactory.initElements(driver, ItemInCart.class);
        itemCheckOut = PageFactory.initElements(driver, ItemCheckOut.class);
    }
    @Test
    public void TestCheckOut() throws Exception{
        itemInCart.SeleniumInCart();
        itemCheckOut.ChecOutPage();
    }
}

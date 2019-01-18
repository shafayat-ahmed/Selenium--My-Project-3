package SeleniumCheckOutPage;

import SeleniumCheckOut.ItemInCart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestItemInCart extends ItemInCart {
    ItemInCart itemInCart;
    @BeforeMethod
    public void initElement() {
        itemInCart = PageFactory.initElements(driver, ItemInCart.class);
    }
    //User should be able to put item in cart
    @Test
    public void testCart() throws Exception{
        itemInCart.SeleniumInCart();
    }
}

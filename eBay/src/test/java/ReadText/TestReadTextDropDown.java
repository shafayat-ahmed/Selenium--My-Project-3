package ReadText;

import ReadList.ReadDropDown;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestReadTextDropDown extends ReadDropDown {
    @Test
    public void TestReadDropDown(){
        readText();
    }
}

package KeyWordDrivenPage;

import KeyWordDriven.KeyWordDriven;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
public class TestKeyWordDriven extends KeyWordDriven {
    KeyWordDriven objOfKeyWordDriven;
    @BeforeMethod
    public void initializeObjects() {
        objOfKeyWordDriven = PageFactory.initElements(driver, KeyWordDriven.class);
    }
    @Test
    public void testSignInWithInvalidIdAndPassword() throws IOException, InterruptedException {
        objOfKeyWordDriven.selectFeature();
    }
}

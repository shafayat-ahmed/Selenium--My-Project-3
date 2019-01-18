package SeleniumCheckOut;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemCheckOut extends CommonAPI {
    @FindBy(css = ("#firstName"))
    public static WebElement FirstName;
    public void SendFirstName() {
        FirstName.sendKeys("Shafayat");
    }
    @FindBy(css = ("#lastName"))
    public static WebElement LastName;
    public void SendLastName() {
        FirstName.sendKeys("Ahmed");
    }
    @FindBy(css = ("#email"))
    public static WebElement Email;
    public void SendEmail() {
        Email.sendKeys("Shafayat@yahoo.com");
    }
    @FindBy(css = ("#emailConfirm"))
    public static WebElement ConfirmEmail;
    public void SendConfirmEmail() {
        ConfirmEmail.sendKeys("Shafayat@yahoo.com");
    }
    @FindBy(xpath = ("//button[@class='btn btn--primary btn--medium']"))
    public static WebElement DoneButton;
    public void ClickDone() {
        DoneButton.click();
    }
    public void ChecOutPage(){
        SendFirstName();
        SendLastName();
        SendEmail();
        SendConfirmEmail();
        ClickDone();
    }
}


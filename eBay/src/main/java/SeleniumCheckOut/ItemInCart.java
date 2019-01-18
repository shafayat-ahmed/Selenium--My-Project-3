package SeleniumCheckOut;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemInCart extends CommonAPI {

    @FindBy(css = ("#gh-ac"))
    public static WebElement SearchSelenium;
    public void FindSelenium() {
        SearchSelenium.sendKeys("Java For Dummies by Barry A. Burd");
    }
    @FindBy(css = ("#gh-btn"))
    public static WebElement SearchButton;
    public void ClickSearchButton() throws Exception{
        SearchButton.click();
        Thread.sleep(3000);
    }
    @FindBy(xpath = ("//*[@id=\"srp-river-results-listing2\"]/div/div[2]/a/h3"))
    public static WebElement ClickSelenium;
    public void ClickSelenium(){
        //Double Click Technique
        /*Actions action = new Actions(driver);
        WebElement btn;
        btn = driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a"));
        action.doubleClick(btn).perform();*/
        ClickSelenium.click();
    }
    @FindBy(css = ("#binBtn_btn"))
    public static WebElement BuyItNow;
    public void ClickBuyItNow(){
        BuyItNow.click();
    }
    @FindBy(xpath = ("//*[@id=\"sbin-gxo-btn\"]"))
    public static WebElement GuestCheckOut;
    public void ClickGuestCheckOut(){
        GuestCheckOut.click();
    }
    public void SeleniumInCart() throws Exception{
        FindSelenium();
        ClickSearchButton();
        ClickSelenium();
        ClickBuyItNow();
        ClickGuestCheckOut();
    }
}


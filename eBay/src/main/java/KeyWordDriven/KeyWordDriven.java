package KeyWordDriven;

import DataDrivenDataReader.ExcelSearch;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import MainPage.SignInUser;
import java.io.IOException;

public class KeyWordDriven extends CommonAPI {
    SignInUser objOfHomePage = PageFactory.initElements(driver, SignInUser.class);
    ExcelSearch objOfByInputFromExls = PageFactory.initElements(driver, ExcelSearch.class);

    //KeyWord ClickSigIn
    public void clickSignIn() throws InterruptedException {
        objOfHomePage.ClickViewSignInUser();
    }
    //KeyWord ClickSigIn
    public void SendInputSignInEmailorID() throws InterruptedException {
        objOfHomePage.InputSignInEmailorID();
    }
    //KeyWord SignIn
    public void SendInputSignInPassWord() throws InterruptedException {
        objOfHomePage.InputSignInPassWord();
    }
    //KeyWord SignIn
    public void ClickSignInButton() throws InterruptedException {
        objOfHomePage.ClickSignInButton();
    }

    public void selectAction(String featureName) throws IOException, InterruptedException {
        switch (featureName) {
            case "ClickSignIn":
                clickSignIn();
                break;
            case "SendInputSignInEmailorID":
                SendInputSignInEmailorID();
                break;
            case "SendInputSignInPassWord":
                SendInputSignInPassWord();
                break;
            case "ClickSignInButton":
                ClickSignInButton();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }
    public void selectFeature() throws IOException, InterruptedException {
        String[] keyword = objOfByInputFromExls.getDataFromSignInKeyword("Key.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}

